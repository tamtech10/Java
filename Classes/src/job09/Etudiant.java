package job09;

public class Etudiant {

    private String nom;
    private double moyenne;

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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setMoyenne(double newMoyenne) {
        if (newMoyenne < 0 || newMoyenne > 20) {
            System.out.println("Moyenne est imposible");
        } else {
            this.moyenne = newMoyenne;
        }
    }
    public double getMoyenne() {
        return this.moyenne;
    }
}
