import java.util.Scanner;

public class P3E11 {

    public static void main(String[] args) {

        convertisseur();

    }

    public static void convertisseur() {

        Scanner scan = new Scanner(System.in);
        int choix;
        int celsius;
        int fahrenheit;

        do { //
            System.out.println("Menu: ");
            System.out.println("Choix 1 - Celsius vers Fahrenheit; ");
            System.out.println("Choix 2- Fahrenheit vers Celsius; ");
            System.out.println("Choix 3 - Quitter. ");
            System.out.println("Votre choix: ");

            choix = scan.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Entrez la température en Celsius : ");
                    celsius = scan.nextInt();
                    fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(celsius + "°C = " + fahrenheit + "°F");
                    break;
                case 2:
                    System.out.println("Entrez la température en Fahrenheit : ");
                    fahrenheit = scan.nextInt();
                    celsius = (fahrenheit - 32) * 5 / 9;
                    System.out.println(fahrenheit + "°F=" + celsius + "°C");
                    break;
                case 3:
                    System.out.println("Convertisseur terminé.");
                    break;
                default:
                    System.out.println("Erreur");
            }
            System.out.println();
        } while (choix != 3);
    }
}
