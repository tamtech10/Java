package job09;

public class Etudiant {

    private String nom;
    private double[] notes;
    private int age;

    public Etudiant(String nom, double[] notes, int age) {
        this.nom = nom;
        this.notes = notes;
        this.age = age;
    }

    public double[] getNotes() {
        return notes;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 100 && age > 0) {
            this.age = age;
        } else {
            System.out.println("Not valid");
        }
    }
}
