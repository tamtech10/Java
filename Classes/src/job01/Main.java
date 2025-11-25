package job01;

public class Main{

    public static void main(String[] args) {

       Personne unePersonne = new Personne();

       unePersonne.nom = "Tamara";
       unePersonne.age = 30;

        System.out.println("Mon nom est " + unePersonne.nom + ";");
        System.out.println("J'ai " + unePersonne.age + " ans.");
    }

}