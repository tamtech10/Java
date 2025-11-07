import java.util.Scanner;

public class P2E8 {

    public static void main (String[] args) {

        nombreDeChiffre ();

    }
    public static void nombreDeChiffre (){
        Scanner input = new Scanner(System.in);
        System.out.print("Entrer un nombres pour connaitre le nombre de chiffre le composant: ");

        int valeur1 = input.nextInt();
        int length = 0;
        int temp = 1;

        while (temp <= valeur1) {
            length++;
            temp *= 10;
        }
        System.out.print(length);
    }                                                //verzija Maxime





    //moja nezavresena verzija
    //public static int compterChiffres (int n) {

       //n = Math.abs(n); // if the value is negative
       //if (n == 0) {    // if zero display 1
       //    return 1;
       //}
       //int compteur = 0;

       //while (n > 0) {


       //}
    //}
}
