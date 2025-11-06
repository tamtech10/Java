import java.util.Scanner;

public class P1E3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez un nombre: ");
        int choix = scan.nextInt();
        multiplication(choix);
    }

    public static void multiplication(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n*i));

        }
    }
}
