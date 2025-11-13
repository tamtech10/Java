import java.util.Arrays;

public class P6E28 {

    static void main(String[] args) {

        int[] tableau1 = {3, 8, 12, 5, 9, 14, 7, 16, 2, 11, 18, 6};
        int[] tableauPairs = nbPairs(tableau1);

        System.out.println("Tableau original :" + Arrays.toString(tableau1));
        System.out.println("Tableau avec les nombres pairs :" + Arrays.toString(tableauPairs));
    }

        public static int[] nbPairs(int[] tableau) {

        int count = 0;
        for (int n : tableau) {
            if (n % 2 == 0) {
                count++; // count even numbers
            }
        }

        int[] pairs = new int[count]; // even numbers in a row
        int index = 0;

        for (int n : tableau) {
            if (n % 2 == 0) {
                pairs[index] = n;
                index++;
            }
        } return pairs;
    }
}

