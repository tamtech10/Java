package job09;

import job08.Etudiant;

public class Main {

    static void main(String[] args) {

        job08.Etudiant e1 = new job08.Etudiant("Maria", 13);
        job08.Etudiant e2 = new job08.Etudiant("Marco", 9.1);
        job08.Etudiant e3 = new Etudiant("Lucas", 14.2);

        e1.afficherInfos();
        e2.afficherInfos();
        e3.afficherInfos();

    }
}
