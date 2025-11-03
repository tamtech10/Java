public class Job08 {

    public static void main(String[] args) {

        int[] numbers = {84, 12, 1, 43, 5, 0, 870};

        for (int i = 0; i < numbers.length - 1; i++) { //takes each number in the sequence
            for (int j = i + 1; j < numbers.length; j++) { //compares a number with the next number
                if (numbers[i] > numbers[j]) { //if it is bigger, swap places
                    int valeur = numbers[i]; //variable that stores a value
                    numbers[i] = numbers[j]; //switch places
                    numbers[j] = valeur;     //
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
    }

