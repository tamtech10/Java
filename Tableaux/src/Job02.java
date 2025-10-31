public class Job02 {

    public static void main(String[] args) {

        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        char[] array = str.toCharArray();

        //nacin 1
        //int  count = 1;
        //for (char C :array) {
        //if (count % 2 !=0) {
        // System.out.println(c);

        //nacin 2
        //for (int i = 0; i < array.length; i++) {
        // if ((i % 2) == 0)
        //System.out.print(array[i])

        //nacin 3
        for (int i = 0; i < array.length; i+=2 ) {
                System.out.print(array[i]);
            }
        }
    }

