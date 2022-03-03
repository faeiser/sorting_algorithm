package sorting_algorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] unsorted = { 8, 4, 10, 2, 5, 9, 1, 3, 7, 6 };
        int number;

        for (int i = 1; i <= (unsorted.length - 1); i++) {
            number = unsorted[i];
            int j = i;
            while (j > 0 && unsorted[j-1] > number){
                unsorted[j] = unsorted[j-1];
                j -= 1;
            }
            unsorted[j] = number;
        }

        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i]+", ");
        }

    }
}
