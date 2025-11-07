public class Job07 {

    public static void main(String[] args) {

        String first = gras( "La Plateforme est une Ecole");
        System.out.println(first);

    }

    //first method gras
    public static String gras(String mots) {

        String resultat = " ";
        String[] texte = mots.split(" ");//deli tekst na niz reci, gde god ima razmak

        for (String mot : texte) {  // prolazimo kroz svaku reč
            char c = mot.charAt(0); // nula jer je prvo slovo reci

            if (c >= 'A' && c <= 'Z') {
                resultat = resultat + "*" + mot + "*" + " ";
            } else {
                resultat = resultat + mot + " ";
            }

        } return resultat;
    }

    public static String plateforme(String str) {
        String[] array = str.split(" ");
        return  "";
    }

}
