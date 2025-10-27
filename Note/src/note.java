import java.util.Scanner;

public class note {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Une note entre 0 et 20");
        int nombre = input.nextInt();

        if ( nombre>=16 ) {
            System.out.println("Très bien");

            } else if (nombre >= 12) {
                System.out.println("Bien");
            } else if (nombre >= 10) {
                System.out.println("Assez bien");
            }   else {
            System.out.println("Insuffisant");
            }

    }
}
