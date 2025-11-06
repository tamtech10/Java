import java.util.Scanner;

public class P1E5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choisissez un nombre: ");
        int n = scan.nextInt();
        nDamier(n);

    }
    public static void nDamier(int n) {

        for(int row = 0; row < n; row++) {

            for(int col = 0; col < n; col++) {

                if ((row + col) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

    }
}

