package Exercise6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientNumber {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
    Socket client = new Socket("localhost",2901);
        System.out.println("Client Connecting...");
        System.out.println("Connection Established");

        //Read the instructions from server.
        ObjectInputStream fromServer = new ObjectInputStream(client.getInputStream());
        System.out.println(fromServer.readObject());

        //Send the first integer.
        ObjectOutputStream toServer = new ObjectOutputStream(client.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        toServer.writeObject(number1);

        //Read instructions from server.
        System.out.println(fromServer.readObject());

        //Send the second integer.
        int number2 = scanner.nextInt();
        toServer.writeObject(number2);

        //Read the sum from the server.
        System.out.println("The sum of the integers is "+fromServer.readObject());

    }
}
