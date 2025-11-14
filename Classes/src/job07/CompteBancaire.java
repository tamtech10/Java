package job07;

public class CompteBancaire {

    double solde;

    public CompteBancaire(double soldeAcctuel) {
        this.solde = soldeAcctuel;
    }


    public void deposer(double montant) {
        solde += montant;

        System.out.println("J'ai deposé " + montant + "€");
    }

    public void retirer(double montant) {

        if(montant <= solde) {
            solde = solde - montant;
            System.out.println("J'ai retiré " + montant);
        } else {
            System.out.println("Operation impossible ! ");
        }
    }

    public void afficherSolde() {
        System.out.println("Montant après la transaction: " + solde + "€");
    }
}
