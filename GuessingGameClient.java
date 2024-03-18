import java.rmi.Naming;
import java.util.Scanner;

public class GuessingGameClient {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            GuessingGameInterface game = (GuessingGameInterface) Naming.lookup("rmi://localhost/GuessingGame");

            while (true) {
                System.out.println("Digite um número entre 1 e 100 (-1 para sair): ");
                int guess = scanner.nextInt();
                if (guess == -1) {
                    System.exit(0);
                }
                String result = game.guess(guess);
                System.out.println(result);
                if (result.equals("Parabéns! Você acertou!")) {
                    System.out.println("Você venceu!");
                }
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
