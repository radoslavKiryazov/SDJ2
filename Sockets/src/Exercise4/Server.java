package Exercise4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Server is started...");

        ServerSocket welcomeSocket = new ServerSocket(2109);
        while(true){
            Socket client = welcomeSocket.accept();
            System.out.println("Client is connected;");
            ObjectOutputStream sendToClient = new ObjectOutputStream(client.getOutputStream());
            sendToClient.writeObject("Server response: How can I help you?");

            ObjectInputStream fromClient = new ObjectInputStream(client.getInputStream());
            String prompt =" ";
            do {
                prompt = (String)fromClient.readObject();
                sendToClient.writeObject("Server response: Please enter argument");
                String argument = (String) fromClient.readObject();

                if (prompt.equals("uppercase")) {
                    sendToClient.writeObject(argument.toUpperCase());
                } else {
                    sendToClient.writeObject(argument.toLowerCase());
                }
            }
            while(!(prompt.equals("stop")));
            String goodbye = "Thanks for playing. Goodbye";
            sendToClient.writeObject(goodbye);
        }

        }
    }
