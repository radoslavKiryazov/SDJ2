import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Socket client = new Socket("localhost",2109);
        System.out.println("Client is connecting...");
        ObjectOutputStream outToServer = new ObjectOutputStream(client.getOutputStream());
        outToServer.writeObject("Hello");

        ObjectInputStream inFromServer = new ObjectInputStream(client.getInputStream());
        String answer = (String) inFromServer.readObject();
        System.out.println("Client received: "+answer);

    }
}
