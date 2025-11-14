package job07;

public class Main {

    static void main(String[] args) {

        CompteBancaire tam = new CompteBancaire(500);

        tam.deposer(150);
        tam.retirer(320);
        tam.afficherSolde();

    }
}
