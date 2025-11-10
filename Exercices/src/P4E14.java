public class P4E14 {

    public static void main (String[] args) {

        int[] n= {2, 4, 5, 7, 9};

        int resultat = calculerProduit(n);
        System.out.println("Le produit des éléments du tableau est : " + resultat);

    }

    public static int calculerProduit(int[] tableau) {

        int resultat = 1;
        for (int n : tableau) {
            resultat *= n;
        }
        return resultat;
    }
}
