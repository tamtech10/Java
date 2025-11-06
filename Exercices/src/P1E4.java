import java.util.Scanner;

public class P1E4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez un nombre: ");
        int choix = scan.nextInt();
        factorielle(choix);

    }
    public static void factorielle(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact = fact * i; //formula pise se i fact *= i
        }
        System.out.println(fact);
    }
}
