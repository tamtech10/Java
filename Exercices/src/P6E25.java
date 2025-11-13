import java.util.Arrays;

public class P6E25 {

    public static void main (String[] args) {

        double[] temperatures = {3.7, 4.1, 2.3, 0, -3.4, -1.6, 1.1};

        double moyenne = calculerMoyenne(temperatures);
        System.out.println("Tamperature moyenne est: " + moyenne + "°C");

        double max = calculerMax(temperatures);
        System.out.println("Temperature max est: " + max + "°C");

        double min = calculerMin(temperatures);
        System.out.println("Temperature min est: " + min + "°C");
    }

    public static double calculerMoyenne(double[] tableau) {

        double somme = 0;
        for(double n : tableau) {
            somme += n;
        } return somme / tableau.length;
    }

    public static double calculerMax(double[] tableau) {

        double max = tableau[0];
        for (double n : tableau) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double calculerMin(double[] tableau) {

        double min = tableau[0];
        for(double n : tableau) {
            if (n < min) {
                min = n;
            }
        } return min;
    }
}
