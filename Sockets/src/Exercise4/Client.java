package Exercise4;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Socket client = new Socket("localhost",2109);
        System.out.println("Client connecting...");
        Thread.sleep(3000);
        ObjectInputStream fromServer = new ObjectInputStream(client.getInputStream());
        String welcomePrompt = (String) fromServer.readObject();
        System.out.println(welcomePrompt);

        ObjectOutputStream toServer = new ObjectOutputStream(client.getOutputStream());
        Scanner scanner = new Scanner(System.in);
        String prompt =" ";
        do {
            prompt = scanner.nextLine();
            toServer.writeObject(prompt);

            String response = (String) fromServer.readObject();
            System.out.println(response);

            String argument = scanner.nextLine();
            toServer.writeObject(argument);

            String returnArgument = (String) fromServer.readObject();
            System.out.println("Server returned: " + returnArgument);

        } while (!(prompt.equals("stop")));
        System.out.println(fromServer.readObject());

    }
}
