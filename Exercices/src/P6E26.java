public class P6E26 {

    public static void main(String[] args) {

        int[] notes = {3, 5, 7, 9, 11, 13, 15, 16, 18, 20};
        compteNotes(notes);
    }

    public static void compteNotes(int[] tableau) {

        int tresBien = 0;
        int bien = 0;
        int passable = 0;
        int echec = 0;

        for(int n : tableau) {

            if(n >= 16) {
                tresBien++;
            } else if (n >= 12) {
                bien++;
            } else if (n >= 10) {
                passable++;
            } else {
                echec++;
            }
        }

        System.out.println("Résultat final :");
        System.out.println();
        System.out.println("Très bien (>=16) : " + tresBien);
        System.out.println("Bien (>=12) : " + bien);
        System.out.println("Passable (>=10) : " + passable);
        System.out.println("Échec (<10) : " + echec);

    }
}
