import java.util.Scanner;

public class P3E10 {

    public static void main (String[] args) {

        afficherMenu();

    }

    public static void afficherMenu() { //metoda za prikazivanje menija

        Scanner scan = new Scanner(System.in);
        int choix;

        do { // prikazujemo opcije
            System.out.println("Menu: ");
            System.out.println("Choix 1 - Bonjour; ");
            System.out.println("Choix 2- Au revoir; ");
            System.out.println("Choix 3 - Quitter. ");
            System.out.println("Votre choix: ");

            choix = scan.nextInt();

            switch (choix) { // tretiramo opcije
                case 1:
                    System.out.println("Bonjour ! ");
                    break;
                case 2:
                    System.out.println(" Au revoir ! ");
                    break;
                case 3:
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Erreur");
            }
            System.out.println();

        } while ( choix != 3); // continuer jusqu'à ce que l'utilisateur sélectionne l'option 3
    }
}
