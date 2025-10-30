public class Job02 {

    public static void main(String[] args) {

        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i+=2 ) {
                System.out.print(array[i]);
            }
        }
    }

