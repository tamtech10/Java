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
            //if (c > n) {
            // break;  to radimo da ne bi brojao i broj posle
            int c = a + b; // first + second = prochain
            a = b;
            b = c;
        }
        System.out.println();
    }
}
