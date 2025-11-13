public class P6E27 {

    static void main(String[] args) {

        int[] tableau1 = {3, 8, 12, 5, 9, 14};
        int[] tableau2 = {3, 8, 12, 5, 9, 14};

        verifierIdentiques(tableau1, tableau2);

    }

        public static void verifierIdentiques(int[] t1, int[] t2) { //metoda koja proverava da li su tabele identicne

            boolean identiques = true; // pretpostavljamo da jesu isti

            if (t1.length != t2.length) {
                identiques = false;
            } else {
                for (int i = 0; i < t1.length; i++) {
                    if (t1[i] != t2[i]) {
                        identiques = false;
                        break; // da ne bi pretlja proveravala dalje
                    }
                }
            }

            if (identiques) {
                System.out.println("Les tableaux sont identiques.");
            } else {
                System.out.println("Les tableaux sont différents.");
            }
        }
    }


