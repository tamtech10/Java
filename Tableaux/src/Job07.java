public class Job07 {

    public static void main(String[] args) {

        String str = "Certaines choses changent, et d'autres ne changeront jamais.";
        char[] array = str.toCharArray();

        // prvi nacin:
        // char firstChar = array[0];
        // for(int i = 0; i < array.length; i++) {
        // if ( i == array.length - 1 ) {
        // array[i] = firstChar;
        //System.out.print(array[i]);
        // continue;
        // }
        // array[i] = array[i + 1];
        // System.out.print(array[i]);
        // }

        // drugi nacin:
        for (int i = 1; i < array.length; i++) {

            System.out.print(array[i]);
        }
            System.out.println(array[0]);
    }
}
