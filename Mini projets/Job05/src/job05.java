public class job05 {

    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            boolean isPrime = true;

            for(int a = 2; a < i; a++) {
              if (i % a == 0) {
                  isPrime = false;
                  break;
              }
            }

            if (isPrime) {
                System.out.println(i);
            }

        }
    }
}
