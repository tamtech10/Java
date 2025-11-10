public class P4E16 {

    public static void main(String[] args) {

        double[] notes = {2, 5, 7, 3, 1};

        afficheDiff(notes);
    }

    public static double calculeMoyenne (double[] tableau) {

        double somme = 0;
        for (double n : tableau) {
            somme += n;
        }
        return somme/tableau.length;
    }

    public static void afficheDiff (double[] tableau) {

        System.out.println("Différence entre la note et la moyenne des notes: ");

        double moyenne = calculeMoyenne(tableau); //On a appelé la première méthode afin de pouvoir utiliser le résultat
        System.out.println("La moyenne est: " + moyenne);

        for (double n : tableau) {
        double difference = n - moyenne  ; //rezultat prve metode moyenne

        System.out.println("Note" + n + ": " + difference);
        }
    }
}
