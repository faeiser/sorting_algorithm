package sorting_algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] unsorted = { 20, 19, 18, 17, 16, 8, 15, 10, 13, 5, 9, 1, 3, 7, 6, 4, 11, 2, 12, 14 };
        int number;
        for (int i = 0; i < (unsorted.length - 4); i++) {
            for (int j = 1; j <= (unsorted.length - 1); j++) {
                if (unsorted[j - 1] > unsorted[j]) {
                    number = unsorted[j];
                    unsorted[j] = unsorted[j - 1];
                    unsorted[j - 1] = number;
                }
            }
        }
        for (int i = 0; i < unsorted.length; i++) {
            System.out.print(unsorted[i] + ", ");
        }
    }
}
