package Interface;

import java.rmi.*;

public interface ChatRoom extends Remote {

    public void subscribe(ChatUser user, String pseudo) throws RemoteException;

    public void unsubscribe(String pseudo) throws RemoteException;

    public void postMessage(String pseudo, String message) throws RemoteException;

}