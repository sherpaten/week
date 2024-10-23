public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {93, 42, 51, 3, 455, 20, 5, 100, 5487, 87, 96, 21};
        bubbleSort(arr);
        
        // Print sorted array
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop for each pass
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // A swap occurred
                }
            }
            
            // If no two elements were swapped, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}