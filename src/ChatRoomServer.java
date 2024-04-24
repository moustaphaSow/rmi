import Interface.ChatRoom;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ChatRoomServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ChatRoom room = new ChatRoomImpl();
            Naming.rebind("rmi://localhost/ChatRoom", room);
            System.out.println("Chat Room is ready.");
        } catch (Exception e) {
            System.out.println("Server failed: " + e);
        }
 }
}
