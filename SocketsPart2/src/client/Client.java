package client;

import util.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private ObjectOutputStream toServer;
    private ObjectInputStream inFromServer;


    public void startClient() {
        try{
            Socket socket = new Socket("localhost", 2910);
            System.out.println("Connected to the server");

            toServer = new ObjectOutputStream(socket.getOutputStream());
            inFromServer = new ObjectInputStream(socket.getInputStream());

            System.out.println("Please type message >");

            Thread t = new Thread(this::listenToMessages);
            t.setDaemon(true);
            t.start();

            Scanner scanner = new Scanner(System.in);

            while(true){
                System.out.println("Please send a message");
                String scanned = scanner.nextLine();
                Message msg = new Message(scanned);
                toServer.writeObject(scanned);
                if(msg.getMessageBody().equalsIgnoreCase("exit")){
                    socket.close();
                    System.out.println("Client exits.");
                    break;
                }
            }
            Message result = (Message) inFromServer.readObject();
            System.out.println("Client received: "+result);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public void listenToMessages(){
        while(true){
            try{
                Message result = (Message) inFromServer.readObject();
                System.out.println("Client reveiced "+result);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
