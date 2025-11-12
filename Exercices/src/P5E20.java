import java.util.Scanner;

public class P5E20 {

    public static void main(String[] args) {

        int[] nombres = {7, 3, 0, 9, 2, 8, 11, 72, 46};

        chercherAfficheNombre(nombres);
    }

    static int chercherNombre(int[] tableau, int valeur) { // metoda koja ceslja niz i pokazuje gde je broj pronadjen


        for (int i = 0; i < tableau.length; i++) {

            if (tableau[i] == valeur) {
                return i;
            }
        }
        return -1;
    }

    static void chercherAfficheNombre (int[] tableau) { //metoda za unosenje broja i prikaz postoji li i gde

        Scanner scan = new Scanner(System.in);

        System.out.println("Quel nombre cherchez-vous? ");
        int choix = scan.nextInt();

        int position = chercherNombre(tableau, choix); //metoda koja proverava da li broj postoji

        if (position != -1) {

            System.out.println("Le nombre " + choix + " existe dans le tableau à la position " + position);
        } else {
            System.out.println("Le nombre " + choix + " n'existe pas dans le tableau. ");
        }
    }
}
