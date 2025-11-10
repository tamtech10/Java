public class P4E17 {

    public static void main (String[] args) {

        int[] nombres = {-3, 0, -20, 59, -75, 0, 88, 2, -99, 100};
        compteNombres(nombres);

    }

    public static void compteNombres(int[] tableau) {

        int negatifs = 0;
        int nuls = 0;
        int positifs = 0;

        for (int n : tableau) {
            if (n < 0) {
                negatifs++;
            } else if (n == 0) {
                nuls++;
            } else {
                positifs++;
            }
        }

        System.out.println("Nombres négatifs: " + negatifs);
        System.out.println("Nombres nuls: " + nuls);
        System.out.println("Nombres positifs: " + positifs);
    }
}
