public class Job06 {

    public static void main(String[] args) {

        String str = "Les choses que l'on possède finissent par nous posséder.";

        for (int i = str.length() - 1 ; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
