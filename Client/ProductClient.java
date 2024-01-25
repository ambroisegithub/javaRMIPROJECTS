import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ProductClient extends Remote {
    String getName() throws RemoteException;

    String getDescription() throws RemoteException;

    double getPrice() throws RemoteException;
}
