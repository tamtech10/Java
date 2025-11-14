package job06;

public class Voiture {

    String marque;
    int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("La vitesse actuelle est : " + vitesse + " km/h");

    }

    public void afficher() {
        System.out.println("Voiture : " + marque + ", vitesse : " + vitesse + " km/h");
    }

}
