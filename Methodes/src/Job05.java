public class Job05 {

    public static void main(String[] args) {

    int nombre = occurrences("Programmation informatique", 'm');
        System.out.println(nombre);
    }

    public static int occurrences(String str, char caractere) {

        int count = 0;

        //convert a string to a string of characters
        char[] tab = str.toCharArray();

        //go through each character in sequence
        for(int i = 0; i < tab.length; i++) {

            if(tab[i] == caractere) {
                count++;
            }
        }
        return count;

    }
}
