import java.util.Random;
import java.util.Scanner;

public class P2E6 {

    public static void main(String[] args) {

        nbDeviner();
    }

    public static void nbDeviner() {

        Scanner scan = new Scanner((System.in));
        Random ran = new Random(); // creating a Random Object ran
        int randomNumber = ran.nextInt(100) + 1; //generating a number using nextInt() method
        int essay = 0;                                  //100 je od 0 do 99 zato + 1

        do {
            System.out.println("Nous allons jouer ! Saisissez un numéro: ");
            essay = scan.nextInt();

            if (essay < randomNumber) {
                System.out.println("Nombre trop petit ");
            } else if (essay > randomNumber) {
                System.out.println("Nombre trop grand");
            } else {
                System.out.println("Parfait ! Vous avez trouvé le numéro: " + randomNumber);
            }

        }  while ( essay != randomNumber );
            scan.close();
    }
}
