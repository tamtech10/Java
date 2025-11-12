import java.util.Arrays;

public class P6E24 {

    static void main(String[] args) {

        int[] nombres = {2, 5, 7, 10, 13, 16, 19, 22, 27, 43, 50, 51, 58, 63, 70};
        System.out.println("Le tableau de 15 nombres :" + Arrays.toString(nombres));
        comptePairsImpairs(nombres);
    }

    public static void comptePairsImpairs(int[] tableau) {
        int pairs = 0;
        int impairs = 0;

        for (int n : tableau) {
            if (n % 2 == 0) {
                pairs++;
            } else {
                impairs++;
            }
        }
        System.out.println("Nombre de nombres pairs : " + pairs);
        System.out.println("Nombre de nombres impairs : " + impairs);
    }
}
