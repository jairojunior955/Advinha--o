import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GuessingGameInterface extends Remote {
    String guess(int guess) throws RemoteException;
}
