public class Job02 {

    public static void main(String[] args) {

        bonjour(true);
        bonjour(false);
    }


    public static void bonjour(boolean jour) {
        if (jour) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Bonsoir");
        }
    }

}

