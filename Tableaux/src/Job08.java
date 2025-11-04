public class Job08 {

    public static void main(String[] args) {

        int[] numbers = {84, 12, 1, 43, 5, 0, 870};

        //prvi nacin
        //int[] numbers = {84, 12, 1, 43, 5, 0, 870};
        //for (int i = 0; i < arr.length - 1; i++) {
        //for (int j = 0; j < arr.length - 1 - i; j++) {
        //if (arr[j] > arr[j + 1]) {
        //int temp = arr[j];
        //arr[j] = arr[j + 1];
        //arr[j + 1] = temp;
        //}
        //}
        //}

        //drugi nacin
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
// Arrays.sort

// treci nacin
//  public class JobTab8 {
//    public static void main(String[] args) {
//        // sort the array elements from smallest to largest
//
//        int[] tab = {123, 0, 98, 171, 3, 459, 67};
//        System.out.println(" Sort the Array Element from Smallest to Largest: ");
//
//        for (int i = 0; i < tab.length; i++) { // browse the tab
//            int smallest = i; //define the index i as the smallest by default
//            for (int j = i + 1; j < tab.length; j++) // j the index for smallest
//            {
//                if (tab[j] < tab[smallest]) //we compare the smallest to the new index
//                {
//                    smallest = j;   // if true so the index j become the new smallest
//
//                }
//            }
//            int order; // the new variable for the smallest
//            order = tab[i]; //put the variable into the first tab
//            tab[i]=tab[smallest]; // we define as the smallest
//            tab[smallest]= order; //we attribute the value of smallest to order
//            for (int x : tab) {
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }
//
//        for (int x : tab) {
//            System.out.print(x+" ");
//        }