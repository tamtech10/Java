import java.util.Scanner;

public class P1E2 {

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int choix = scan.nextInt();
        suiteFibonacci(choix);
    }

    public static void suiteFibonacci(int n) {

        int a = 0;
        int b = 1;

        for(int i = 0; i < n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
}
