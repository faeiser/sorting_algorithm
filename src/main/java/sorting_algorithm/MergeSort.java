package sorting_algorithm;

public class MergeSort {

    private static int[] sort(int[] array) {
        int[] left, right;
        int mid;
        if (array.length <= 1) {
            return array;
        } else {
            // ### division of the list into right and left
            mid = array.length / 2;
            // ### initialization and filling left list
            left = new int[mid];
            for (int i = 0; i < left.length; i++) {
                left[i] = array[i];
            }
            // ### initialization and filling right list
            right = new int[array.length - mid];
            for (int i = 0; i < right.length; i++) {
                right[i] = array[i + mid];
            }
            // ### recall until list length <= 1
            left = sort(left);
            right = sort(right);
            // ### transfer to function merge
            return merge(left, right);
        }
    }

    private static int[] merge(int[] left, int[] right) {
        // ### initialization left & right list + index for all lists
        int[] sorted = new int[left.length + right.length];
        int index_sorted = 0, index_left = 0, index_right = 0;
        // ### sorting and filling the smallest value
        while (index_left < left.length & index_right < right.length) {
            if (left[index_left] > right[index_right]) {
                sorted[index_sorted] = right[index_right];
                index_right += 1;
                index_sorted += 1;
            } else {
                sorted[index_sorted] = left[index_left];
                index_left += 1;
                index_sorted += 1;
            }
        }
        // ### filling the larger value
        while (index_left < left.length) {
            sorted[index_sorted] = left[index_left];
            index_left += 1;
            index_sorted += 1;
        }
        while (index_right < right.length) {
            sorted[index_sorted] = right[index_right];
            index_right += 1;
            index_sorted += 1;
        }
        // ### return sorted list
        return sorted;
    }

    public static void main(String[] args) {
        int[] a = { 99, 38, 61, 111, 14, 3, 37, 42, 87, 69, 32, 5, 110 };

        System.out.print("Unsorted: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        a = sort(a);
        System.out.print("Sorted: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
