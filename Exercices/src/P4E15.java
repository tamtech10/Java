public class P4E15 {

    static void main(String[] args) {

        int[] nombres = { -3, 1, -7, 2, -11, 9, 13, -5};
        int[] resultat = trouverMin(nombres); // metoda za najmanji broj u nizu
        System.out.println("Le plus petit nombre est : " + resultat[0]);
        System.out.println("Son index dans le tableau est : " + resultat[1]);

    }

    public static int [] trouverMin(int[] tableau) {

        int min = tableau[0];
        int position = 0;

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < min) {
                min = tableau[i];
                position = i;
            }
        } return new int[] {min, position};
    }
}
