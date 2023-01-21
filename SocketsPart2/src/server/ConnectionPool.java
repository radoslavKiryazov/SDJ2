package server;

import util.Message;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {
    private List<ServerSocketHandler> connections = new ArrayList<>();


    public void addClient(ServerSocketHandler ssh){
        connections.add(ssh);
    }

    public void removeClient(ServerSocketHandler ssh){
        if(connections.contains(ssh)){
            connections.remove(ssh);
        }
    }
    public void breadcast(Message message) throws IOException {
        System.out.println("Sending " + message +"to"+ connections.size() +" clients ");
        for (ServerSocketHandler ssh:
             connections) {
            ssh.sendMessage(message);

        }
    }
}
