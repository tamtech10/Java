public class Job08 {

    public static void main(String[] args) {

        int[] numbers = {84, 12, 1, 43, 5, 0};

        for (int i = 0; i < numbers.length - 1; i++) { //prva petlja uzima svaki broj u nizu i proverava ga

            for (int j = i + 1; j < numbers.length; j++) { //druga petlja uporedjuje sa brojem posle njega
                if (numbers[i] > numbers[j]) { //ako je veci zamene mesta
                    int valeur = numbers[i]; //dodeljujemo promenljivu koja cuva vrednost levog broja
                    numbers[i] = numbers[j]; //zamenjujemo mesta brojevima
                    numbers[j] = valeur;     //
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }


    }
    }

