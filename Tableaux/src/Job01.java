public class Job01 {

    public static void main(String[] args) {

        int[] numbers = {200, 204, 173, 98, 171, 404, 459};


        //for (int n: numbers) { //FOR EACH
        //  if ( nb % 2 == 0) {
        //                System.out.println( nb +  "est pair");
        //            } else {
        //                System.out.println( nb + "est impair");

        for (int i = 0; i < numbers.length; i++) {

            int nb = numbers [i];

            if ( nb % 2 == 0) {
                System.out.println( nb +  "est pair");
            } else {
                System.out.println( nb + "est impair");
            }
        }
    }
}

