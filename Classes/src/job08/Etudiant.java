package job08;

public class Etudiant {

    String nom;
    double moyenne;

    public Etudiant(String nom, double moyenne) {
        this.nom = nom;
        this.moyenne = moyenne;
    }

    public void afficherInfos() {

        System.out.println("Nom d'étudiant " + nom);
        System.out.println("Note " + moyenne);

        if (moyenne >= 10) {
            System.out.println("L’étudiant est admis .");
        } else {
            System.out.println("L’étudiant est recalé");
        }
    }
}
