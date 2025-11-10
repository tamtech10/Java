import java.util.Scanner;

public class P5E18 {

    static void main(String[] args) {

        int[] nombres = new int[10]; // kreairamo prazan niz od 10 elemenata

        remplirTab(nombres);
        afficherTab(nombres);
    }

    static void remplirTab(int[] tableau) { // metoda za unos brojeva u niz
        Scanner scan = new Scanner(System.in);

        System.out.println("Entrez 10 nombres entiers : ");

        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : "); //pita te za broj 1, broj 2, broj 3...
            tableau[i] = scan.nextInt();
        }
        System.out.println();
    }

    static void afficherTab(int[] tableau) { // metoda za prikaz unetih brojeva

        System.out.println("Nos dix nombres choisis: ");
        for (int n : tableau) {
            System.out.print(n + "; ");
        }
        System.out.println();
    }
}
