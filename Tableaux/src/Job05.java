public class Job05 {

    public static void main(String[] args) {

        String str = "On n’est pas le meilleur quand on le croit mais quand on le sait";

        int voyelles = 0;
        int consonnes = 0;

        char[] array = str.toCharArray();

        for (char c : array) {
           if (c == 'O' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            voyelles++;

            } else if (c != ' ' && c !='\'' && c != '’') {
                consonnes++;

            }
        }

        System.out.println("Nombre de voyelles: " + voyelles);
        System.out.println("Nombre de consonnes: " + consonnes);
    }
}

