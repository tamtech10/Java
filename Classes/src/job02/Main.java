package job02;

public class Main {

    public static void main(String[] args) {

        Personne unePersonne = new Personne();

        unePersonne.nom = "Tamara";
        unePersonne.age = 30;
        unePersonne.sePresenter();

        Personne p2 = new Personne();
        p2.nom = "Maria";
        p2.age = 25;
        p2.sePresenter(); //pravimo nove osobe i dodeljujemo im isto

    }

}
