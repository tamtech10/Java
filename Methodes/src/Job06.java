public class Job06 {

    public static void main(String[] args) {

        String lettre = leetSpeak("La plateforme");
        System.out.println(lettre);
    }

    public static String leetSpeak(String str) {

        String result = "";
        char[] tab = str.toCharArray();

        //  for(int i = 0; i < tab.length; i++) {
        //      tab[i] = Character.toUpperCase(tab[i]);
        // }

        for(int i = 0; i < tab.length; i++) {
            switch (tab[i]) {
                case 'A':
                    tab[i] = '4';
                    break;
                case 'B':
                    tab[i] = '8';
                    break;
                case 'E':
                    tab[i] = '3';
                    break;
                case 'G':
                    tab[i] = '6';
                    break;
                case 'L':
                    tab[i] = '1';
                    break;
                case 'S':
                    tab[i] = '5';
                    break;
                case 'T':
                    tab[i] = '7';
                    break;
                case 'a':
                    tab[i] = '4';
                    break;
                case 'b':
                    tab[i] = '8';
                    break;
                case 'e':
                    tab[i] = '3';
                    break;
                case 'g':
                    tab[i] = '6';
                    break;
                case 'l':
                    tab[i] = '1';
                    break;
                case 's':
                    tab[i] = '5';
                    break;
                case 't':
                    tab[i] = '7';
                    break;
                default: break; // nista nije ako nije jedno od tih slova
            }
            result += tab[i];
        }
        return result;
    }
}
