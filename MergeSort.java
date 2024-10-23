public class MergeSort {

    // Main function that sorts arr[] using merge()
    public void sort(int arr[]) {
        if (arr.length < 2) {
            return; // Base case: if the array has less than 2 elements, it's already sorted
        }
        int mid = arr.length / 2; // Find the middle point
        int[] left = new int[mid]; // Create left subarray
        int[] right = new int[arr.length - mid]; // Create right subarray

        // Copy data to left and right subarrays
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the left and right subarrays
        sort(left);
        sort(right);

        // Merge the sorted subarrays
        merge(arr, left, right);
    }

    // Merges two subarrays into arr[]
    public void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge left and right arrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements of left[], if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements of right[], if any
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    // Driver method
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        ms.sort(arr);

        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}