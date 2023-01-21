import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Server is started...");

        ServerSocket welcomeSocket = new ServerSocket(2109);
        while (true){
            Socket client = welcomeSocket.accept();
            System.out.println("Client connected!");

            ObjectInputStream inFromClient = new ObjectInputStream(client.getInputStream());
            String o = (String) inFromClient.readObject();
            System.out.println("Received from the client "+o);

            String answer = o.toUpperCase();
            ObjectOutputStream outFromClient = new ObjectOutputStream(client.getOutputStream());
            outFromClient.writeObject(answer);
            System.out.println("Server sent: "+answer);
        }
    }
}
