public class Job05 {

    public static void main(String[] args) {

    int nombre = occurrences("Programmation informatique", 'm');
        System.out.println(nombre);
    }
    //System.out.println("Number of occurrences in string" + occurrences("code a la carte...
    //drugi nacin i kraci da pozovemo

    public static int occurrences(String str, char caractere) {

        int count = 0;

        //convert a string to a string of characters
        char[] tab = str.toCharArray();

        //go through each character in sequence (mozemo raditi i sa for each)
        for(int i = 0; i < tab.length; i++) { //ako pritisnes na for koje je zuto podvuceno samo ce promeniti u for each

            if(tab[i] == caractere) {
                count++;
            }
        }
        return count;

    }
}
