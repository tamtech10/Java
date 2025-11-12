import java.util.Scanner;

public class P5E21 {

    public static void main (String[] args) {

        int[] nombres = {7, 3, 7, 12, 15, 7, 4, 8, 7, 3};
        compterOccurrences(nombres);

    }
    public static void compterOccurrences(int[] tableau) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quel nombre cherchez-vous? ");
        int choix = scan.nextInt();
        int count = 0;

        for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] == choix) {
                count++;
            }
        } System.out.println("Le nombre " + choix + " est répété " + count + " fois ");
    }
}
