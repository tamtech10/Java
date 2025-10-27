import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.out.println("Choisissez une opération:");
        System.out.println("1.Addition:");
        System.out.println("2.Soustraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        int choice = input.nextInt();

        if (choice == 1) {

            System.out.println("¨Entrer la premier valeur:");
            int valeur1 = input.nextInt();

            System.out.println("Entrer la deuxiem valeur:");
            int valeur2 = input.nextInt();


            int resultat = valeur1+valeur2;

            System.out.println(resultat);}

        if (choice ==2 ) {
            System.out.println("¨Entrer la premier valeur:");
            int valeur1 = input.nextInt();

            System.out.println("Entrer la deuxiem valeur:");
            int valeur2 = input.nextInt();

            int resultat = valeur1-valeur2;

            System.out.println(resultat);}


        if (choice ==3 ) {
            System.out.println("¨Entrer la premier valeur:");
            int valeur1 = input.nextInt();

            System.out.println("Entrer la deuxiem valeur:");
            int valeur2 = input.nextInt();

            int resultat = valeur1*valeur2;

            System.out.println(resultat);}

        if (choice ==4 ) {
            System.out.println("¨Entrer la premier valeur:");
            int valeur1 = input.nextInt();

            System.out.println("Entrer la deuxiem valeur:");
            int valeur2 = input.nextInt();

            int resultat = valeur1/valeur2;

            System.out.println(resultat);}*/

        System.out.println(" une simple calculatrice ");

        System.out.println( "entrer votre 1er nombre: ");
        double nb1 = input.nextDouble();

        System.out.println( "entrer votre 2éme nombre: ");
        double nb2 = input.nextDouble();

        System.out.println( "entrer l'opérateur désiré(  +, -, * , /): ");
        char op = input.next().charAt(0);

        double resultat;
        if ( op == '+'){
            resultat= nb1  + nb2;
            System.out.println("le résultat est: " + resultat);}

            else if (op == '-') {
            resultat= nb1  - nb2;
            System.out.println("le résultat est: " + resultat);}

            else if (op == '*') {
            resultat= nb1  * nb2;
            System.out.println("le résultat est: "+ resultat);}

            else if (op == '/') {

                if (nb2 != 0) {
                resultat = nb1 / nb2;
                System.out.println("le résultat est: "+ resultat);}
                 else {
                System.out.println("erreur");}

        }
                else {
                System.out.println("Char not valid");}


    }
}
