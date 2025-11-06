public class P1E1 {

    public static void main (String[] args) {

    multiples();
    }

    public static void multiples() {
    //public static void multiples(int max)
        for (int i = 1; i <= 50; i++) { //u tom slucaju i <= max)
            if (i % 3 == 0) {
                System.out.println(i);
            }

        }

    }
}
