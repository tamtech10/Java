public class P6E23 {

    static void main(String[] args) {

        int[] array = new int[10];

        remplirTab(array);
        afficherTab(array);

    }
    public static void remplirTab(int[] tableau) {

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = (i + 1) * (i + 1);
        }
    }

    public static void afficherTab(int[] tableau) {

        System.out.println(" Les carrés des nombres de 1 à 10: ");
        for ( int n : tableau) {
            System.out.print( n + " ");
        }
        System.out.println();
    }
}
