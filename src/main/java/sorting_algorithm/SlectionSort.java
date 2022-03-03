package sorting_algorithm;

public class SlectionSort {

    private static int[] select_sort(int array[]) {
        // ### introduction comparison loop 1
        for (int i = 0; i < array.length; i++) {
            // ### variable smallest hit
            int index_min = i;
            // ### introduction comparative loop 2 & separation
            for (int j = 1 + i; j < array.length; j++) {
                // ### storage of the minimum value(index)
                if (array[i] > array[j]) {
                    if (array[j] < array[index_min]) {
                        index_min = j;
                    }
                }
            }
            // ### shift values
            int min_number = array[index_min];
            array[index_min] = array[i];
            array[i] = min_number;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] number_array_unsorted = { 99, 38, 61, 111, 14, 3, 37, 42, 87, 69, 32, 5, 110 },
                sorted = select_sort(number_array_unsorted);

        for (int i : sorted) {
            System.out.print(i + " ");
        }
    }
}
