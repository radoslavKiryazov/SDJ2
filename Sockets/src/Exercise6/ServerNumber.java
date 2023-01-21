package Exercise6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerNumber {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket welcomeSocket = new ServerSocket(2901);
        while(true){
            Socket client = welcomeSocket.accept();
            System.out.println("Client is connected");

            //Server sends out instructions to client.
            ObjectOutputStream toClient = new ObjectOutputStream(client.getOutputStream());
            toClient.writeObject("Hello, this program calculates the sum of two integers. Start by inputting value of the first integer.");

            //Server receives the first integer.
            ObjectInputStream fromClient = new ObjectInputStream(client.getInputStream());
            int number1 = (Integer) fromClient.readObject();
            System.out.println("Integer Number 1 is "+number1);

            //Server sends a request back, asking for the second integer.
            toClient.writeObject("Please input the value of integer number 2");

            //Server receives the second integer.
            int number2 = (Integer) fromClient.readObject();
            System.out.println("Integer Number 2 is "+number2);

            //Server sends back the sum.
            toClient.writeObject(number1+number2);
        }
    }
}
