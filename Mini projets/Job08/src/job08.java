public class job08 {

    public static void main(String[] args) {

        int hauteur = 5; //visina piramide

        // haute
        for (int i = 1; i <= hauteur; i++) {

            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");

            } for (int j = 1; j <= 2 * i - 1; j++) { //ispisuje zvezdice
                System.out.print("*");

            }
            System.out.println();
        }

        // bas
        for (int i = hauteur - 1; i >= 1; i--) {

            for (int j = 1; j <= hauteur - i; j++) {
                System.out.print(" ");

            } for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}