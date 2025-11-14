package job04;

public class Animal {

    String nom;
    String espece;

    public Animal(String nom, String espece) {
        this.nom = nom;
        this.espece = espece;
        }

    public void parler() {

            System.out.println( "Je suis un(e) " + espece + " et je m’appelle " + nom + ".");
        }

}
