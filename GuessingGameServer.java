import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class GuessingGameServer extends UnicastRemoteObject implements GuessingGameInterface {
    private int secretNumber;

    public GuessingGameServer() throws RemoteException {
        super();
        generateSecretNumber();
    }

    private void generateSecretNumber() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;
    }

    @Override
    public String guess(int number) throws RemoteException {
        switch (Integer.compare(number, secretNumber)) {
            case -1:
                return "O número é maior que " + number;
            case 1: 
                return "O número é menor que " + number;
            default:
            generateSecretNumber();
            return "Parabéns! Você acertou!";
        }
    }

    public static void main(String[] args) {
        try {
            GuessingGameServer server = new GuessingGameServer();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("GuessingGame", server);
            System.out.println("Servidor do Jogo de Adivinhação iniciado.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
