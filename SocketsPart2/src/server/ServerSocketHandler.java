package server;

import util.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerSocketHandler implements Runnable {
private Socket socket;
private ConnectionPool connectionPool;
private ObjectInputStream fromClient;
private ObjectOutputStream toClient;


public ServerSocketHandler(Socket socket, ConnectionPool connectionPool){
    this.socket=socket;
    this.connectionPool = connectionPool;
    try{
        fromClient = new ObjectInputStream(socket.getInputStream());
        toClient = new ObjectOutputStream(socket.getOutputStream());
    } catch (IOException ex) {
        ex.printStackTrace();
    }
}


    @Override
    public void run() {
        try {
            while (true) {
                Message read = (Message)fromClient.readObject();
                System.out.println("Received from client: " + read);

                if (read.getMessageBody().equalsIgnoreCase("exit")) {
                    socket.close();
                    connectionPool.removeClient(this);
                    System.out.println("Client disconnected");
                    break;
                }

                String result = read.getMessageBody().toUpperCase();
                Message m = new Message(result);
                connectionPool.breadcast(m);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendMessage(Message message) throws IOException {
        toClient.writeObject(message);
    }
}
