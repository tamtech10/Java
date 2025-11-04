public class Job04 {

    public static void main(String[] args) {


        double somme = calcule(3, '*',4);
        System.out.println(somme);

    }


    public static double calcule(int a, char operateur, int b) {
    double resultat = 0;

    switch (operateur) {
        case '+':
            resultat = a + b;
            break;
        case '-':
            resultat = a - b;
            break;
        case '*':
            resultat = a * b;
            break;
        case '/':
            if (b != 0) {
                resultat = a / b;
            } else {
                System.out.println("Error");
                return 0;
            }
            break;
        case '%':
            resultat = a % b;
            break;
        default:
            System.out.println("Opérateur non valide !");
            return 0;
    }
    return resultat;


    }
    }



