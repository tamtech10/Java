import java.util.Scanner;

public class Nombre {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Entrez un nombre:");
        int nombre = input.nextInt();

        if (nombre > 0) {
            System.out.println("Le nombre est positif.");
        }

        if (nombre < 0) {
            System.out.println("Le nombre est négatif.");
        }

        if (nombre == 0) {
            System.out.println("Le nombre est nul.");
        }
    }

}
