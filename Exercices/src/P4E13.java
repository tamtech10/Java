public class P4E13 {

    public static void main (String[] args) {

        int[] tableau1 = {2, 11, 20, 30, 33};
        System.out.print("Premier tableau: ");
        System.out.print(" ");
        afficherTab(tableau1);

        int[] tableau2 = doubleTab(tableau1);
        System.out.print("Notre premier tableau dupliqué: ");
        afficherTab(tableau2);
    }

    public static void afficherTab (int[] tableau1) {

        for (int valeur : tableau1) {
            System.out.print(valeur + ";  ");
        }
        System.out.println();

    }


    public static int[] doubleTab(int[] tableau2) {

        int[] resultat = new int[tableau2.length];
        for (int i = 0; i < tableau2.length; i++) {
            resultat[i] = tableau2[i] * 2;
        }
        return resultat;
        }

}
