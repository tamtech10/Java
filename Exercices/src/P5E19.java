public class P5E19 {

    static void main(String[] args) {

        int[] nombres = {1, 3, 5, 7, 9, 11, 13};

        System.out.println("Tableau normale: ");
        normalTableau(nombres);

        System.out.println("Tableau inverse: ");
        inversTableau(nombres);


    }

    static void normalTableau(int[] tableau) {

        for (int n : tableau) { // prikazi normalan niz
            System.out.print(n + "; ");
        }
        System.out.println();
    }

    static void inversTableau(int[] tableau) {

        for (int i = tableau.length - 1; i >= 0; i--) { // prikazi obrnuti niz
                System.out.print(tableau[i] + "; ");
            }
            System.out.println();
    }

}
