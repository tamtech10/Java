import java.util.Scanner;

public class Job09 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in); //scanner potreban svaki put kada treba da se unese vrednost u konzolu
            int n = input.nextInt(); //citanje te iste vrednosti

            int[] numb = {4, 5, 7, 9, 11}; //program proverava da li je neki unet broj (i) deljiv sa nekim od ovih brojeva

            int somme = 0; // deklarisemo pocetnu vrednost 0 uvek kada imamo neku operaciju, ona cuva zbir

            for (int i = 1; i < n; i++) { //prva petlja: i broj koji se proverava, znaci svaki broj manji od 15

                for (int d : numb) { // d je jedan broj naseg niza numb
                        //for-each petlja koja kaze: "Za svaki broj d u nizu numb, uradi sledeće"
                    if (i % d == 0) {
                        somme += i; //somme = somme + i (ako je broj i deljiv sa d dodaj ga u zbir)
                    }
                }
            }
            System.out.println(somme);


        }
}

//exercise bonus v2
//Le programme lit un entier n en entrée.
// Il calcule la somme de tous les entiers strictement inférieurs à n
// qui sont multiples d'au moins un des nombres du tableaux : {4, 5, 7, 9, 11}.
// Exemple : pour l'entrée 16, la sortie doit être 95.
