// Java program to rotate an array to the right (clockwise) by k steps
// Using the Reversal Algorithm

class Main {

    /**
     * Reverses the elements of the array between indices start and end (inclusive).
     *
     * @param arr   The input array
     * @param start The starting index
     * @param end   The ending index
     */
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * Rotates the array to the right (clockwise) by k steps using the Reversal Algorithm.
     * 
     * Reversal Algorithm steps:
     * 1. Reverse the last k elements.
     * 2. Reverse the first n-k elements.
     * 3. Reverse the entire array.
     *
     * @param arr The input array
     * @param k   Number of positions to rotate
     */
    public static void rotateclockwise(int[] arr, int k) {
        int n = arr.length;

        // Ensure k is within bounds
        k = k % n;
        if (k == 0) return; // No need to rotate if k is 0

        // Step 1: Reverse last k elements
        reverse(arr, n - k, n - 1);

        // Step 2: Reverse first n-k elements
        reverse(arr, 0, n - k - 1);

        // Step 3: Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int k = 2;
        rotateclockwise(arr, k);

        // Output the rotated array
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
