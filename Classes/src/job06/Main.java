package job06;

public class Main {

    public void main(String[] args) {

        Voiture v1 = new Voiture("Toyota", 0);

        v1.accelerer();
        v1.accelerer();

        v1.afficher();


        Voiture v2 = new Voiture("Audi", 10);

        v2.accelerer();
        v2.accelerer();

        v2.afficher();


    }
}
