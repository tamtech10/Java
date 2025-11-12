import java.lang.reflect.Array;
import java.util.Arrays;

public class P5E22 {

    public static void main (String[] args) {

        int[] tableau1 = {7, 8, 9, 10, 11};
        int[] tableau2 = copierTab(tableau1);

        System.out.println("Premier tableau : " + Arrays.toString(tableau1)); //method for converting Java string array to string
        System.out.println("Deuxiem tableau : " + Arrays.toString(tableau2));

    }

    public static int[] copierTab (int[] tab1) {

        int[] copie = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            copie[i] = tab1[i];
        }
        return copie;
    }
}
