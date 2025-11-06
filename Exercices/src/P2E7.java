import java.util.Scanner;

public class P2E7 {

    public static void main(String[] args) {

        int resultat = additionner();
        System.out.println("La somme totale est : " + resultat);

    }

    public static int additionner () {
        Scanner scan = new Scanner(System.in);
        int numero = 0;
        int somme = 0;

        while ( numero != 0 ) {
            System.out.println("Saisissez le numéro (0 pour annuler) ");
            numero = scan.nextInt();
            somme += numero;
        }
        scan.close();
        return somme;
    }
}

    //    additionner();
    //}
    //public static void additionner () {
    //    Scanner scan = new Scanner(System.in);
    //    int numero = 0;
    //    int somme = 0;
    //    do {
    //        System.out.println("Saisissez le numéro (0 pour annuler) ");
    //        numero = scan.nextInt();
    //        somme = somme + numero;
    //    } while (numero != 0);
        //    System.out.println(somme);
    //}
    //}
