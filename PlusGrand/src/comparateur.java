import java.util.Scanner;

public class comparateur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Entrer le premier numero:");
        double nb1 = input.nextDouble();

        System.out.println("Entrer le deuxiem numero");
        double nb2 = input.nextDouble();

        if (nb1>nb2) {
            System.out.println("Le premier nombre est plus grand.");
        } else if (nb1<nb2) {
            System.out.println("Le deuxiem nombre est plug grand.");
        } else {
            System.out.println("Les deux nombres sont égaux.");
        }

    }
}
