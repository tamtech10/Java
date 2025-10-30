import java.util.Scanner;

public class Calc3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println(" une simple calculatrice ");
        System.out.println(" Numero 5 - Exit");

        while (running) {

            System.out.println("entrer votre 1er nombre: ");
            double nb1 = input.nextDouble();


            System.out.println("entrer votre 2éme nombre: ");
            double nb2 = input.nextDouble();


            System.out.println("entrer l'opérateur désiré(  +, -, * , /): ");
            char op = input.next().charAt(0);

            double resultat;

            switch (op) {

                case '+':
                    resultat = nb1 + nb2;
                    System.out.println("Le resultat est" + resultat);
                    break;
                case '-':
                    resultat = nb1 - nb2;
                    System.out.println("Le resultat est" + resultat);
                    break;
                case '*':
                    resultat = nb1 * nb2;
                    System.out.println("Le resultat est" + resultat);
                    break;
                case '/':
                    if (nb2 != 0) {
                        resultat = nb1 / nb2;
                        System.out.println("Le résultat est : " + resultat);
                    } else {
                        System.out.println("Erreur : division par zéro !");
                    }
                    break;

                case '5':
                    System.out.println("BYE");
                    running = false;
                    break;

                default:
                    System.out.println("Opérateur non valide !");
                    break;
            }
            }
    }
}


