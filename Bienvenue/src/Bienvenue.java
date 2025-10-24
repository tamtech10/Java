import java.util.Scanner;

public class Bienvenue {

    public static void main(String[] args) {
        //ctrl + clique gauche
        //varijable su uvek prvim malim pocetnim slovom

        /*Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name?");

        String nom = myScanner.nextLine();

        System.out.println("Your name is: " +nom + " welcome to Java World");

        //Ako zatvoris svoju konzolu moras praviti novu sa novim nazivom promenljive,
        //ali je bolje da stavis sve pod jednu da ne bi opterecivala ram repetitivnim akcijama

        System.out.println("How old are you?");

        String age = myScanner.nextLine();

        System.out.println(" You have: " + age + "years old" );

        myScanner.close();

        //System.out.print("How old are you?: ");
        //int ulazni mora da se slaze sa nextInt izlaznim delom
        //int age = myScanner.nextInt();
        //System.out.println("Your age is: " +age);
        */


        Scanner input = new Scanner(System.in);

        //comparateur
        int age = input.nextInt();

        //== two values are equal retourn true, si deux valeurs sont egals le resultat sera vrai
        //!= two values are not equal retourn true,ne sont pas egals le resutat est vrai
        /*System.out.println(1 == 1); //true
        System.out.println(2 != 1); //true
        System.out.println(1 == 2); // false
        System.out.println(1 != 1); // false
        //plus petit que
        System.out.println(1 < 5); //true
        //plus grand que
        System.out.println(1 > 5); //false
        //plus petit
        System.out.println(18 <= 18); //true
        System.out.println(12 >= 18); //false */

        /*// + addition
        System.out.println(1 + 2); // 3
        // - soustraction
        System.out.println(3 - 1); // 2
        // * multiplication
        System.out.println(5 * 2); // 10
        // / division
        System.out.println(10 / 2); // 5
        // % modulo
        System.out.println(10 % 2); // 0
        System.out.println(10 % 3); // 1
         // () parenthese
        System.out.println((7*2)) + 3);
        */


        //boolean true/false
        /*System.out.println("How old are you?");

        int age = input.nextInt();

        if (18 > age) {
            System.out.println("You're not 18,go away!");
        } else {
            System.out.println("You can enter");
        } */

    }

}
