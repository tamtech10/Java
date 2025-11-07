import java.util.Scanner;

public class P2E9 {

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Saisissez votre numéro ici: ");
        int numero = scan.nextInt();

        divisibilite(numero);

    }

    public static void divisibilite (int n) {
        int diviseur = 2;
        boolean divisible = false;

        while (diviseur == 2 || diviseur == 3 || diviseur == 5 || diviseur == 7) {

            if (n % diviseur == 0) {
                divisible = true;
            }
            diviseur++;
        }
        if (divisible) {
            System.out.println("Pas premier");
        } else {
            System.out.println("Peut-être premier");
        }
    }
}
