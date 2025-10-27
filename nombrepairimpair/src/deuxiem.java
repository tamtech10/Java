import java.util.Scanner;

public class deuxiem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Entrez un nombre:");
            int nombre = input.nextInt();

            if (nombre % 2 == 0) {
                System.out.println("Le nombre est pair.");
                }

            if (nombre % 2 != 0) {
                    System.out.println("Le nombre est impair.");
            }
    }
}
