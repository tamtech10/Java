package job08;

public class Main {

    static void main(String[] args) {

        Etudiant e1 = new Etudiant("Maria", 13);
        Etudiant e2 = new Etudiant("Marco", 9.1);
        Etudiant e3 = new Etudiant("Lucas", 14.2);

        e1.afficherInfos();
        e2.afficherInfos();
        e3.afficherInfos();
    }
}
