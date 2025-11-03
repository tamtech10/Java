public class Job04 {

    public static void main(String[] args) {

        String str = " Dans l'espace, personne ne vous entend crier";

        //prvi nacin
        // char[] strArray = str.toCharArray();
        // int espace = 0;
        // for (char a : chars) {
        // if (a == ' ') {
        // a = 1;
        // espace += a;
        // }
        // }
        // System.out.println(chars.length - espace)

        //drugi nacin
        // char[] tab = str.toCharArray();
        // int somme = 0;
        // for(int i = 0; i < tab.length; i++) {
        // somme = i+1;
        // }
        // System.out.println(+somme);
        //}


        //treci nacin
        // char[] strArray = str.toCharArray();
        // int total = 0;
        // for (char c : strArray) {
        // if (c == ' ' || c == ',' || c == '\'') {
        // continue;
        //  }
        // if (c == ' ') {
        // continue;
        // }
        // total++;
        // }
        // System.out.println(total);

        //cetvrti nacin:
        int nombre = str.length();

        System.out.println("le nombre total de caractères est: " + nombre);
    }
}
