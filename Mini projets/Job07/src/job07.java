public class job07 {

    public static void main(String[] args) {

        int hauteur = 5;

        for (int i = 1; i <= hauteur; i++) {

            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");

            } for (int j = 1; j <= 2 * i - 1; j++) { //ispisuje zvezdice
                    System.out.print("*");

            } System.out.println();

        }

        }
    }


