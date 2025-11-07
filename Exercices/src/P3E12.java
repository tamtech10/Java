import java.util.Scanner;

public class P3E12 {

    public static void main (String[] args) {

        motdePasee();

    }

    public static void motdePasee () {
        Scanner scan = new Scanner(System.in);
        String mdp = "Tamara12";
        String tentative;

        do {
            System.out.println("Saisissez votre mot de passe: ");
            tentative = scan.nextLine();

            if (!mdp.equals(tentative)) {      // x.equals(y) --- kada uporedjujemo stringove u javi !
                System.out.println("Votre mot de passe est incorrect, veuillez réessayer.");
            }

        } while (!mdp.equals(tentative)); // ponavljaj dok lozinka nije tacna

        System.out.println("Votre mot de passe est correct, bienvenue ! ");
        }
    }

