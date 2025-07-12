// Java program to find the maximum element in an array

class Main {

    /**
     * This method finds the maximum element in the given array.
     *
     * @param arr The input array of integers
     * @return The maximum value found in the array
     */
    public static int findMax(int arr[]) {
        // Initialize max with the first element of the array
        int max = arr[0];

        // Traverse the array to find the largest value
        for (int i = 0; i < arr.length; i++) {
            // If the current element is greater than max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Return the largest value found
        return max;
    }

    public static void main(String[] args) {
        // Sample array
        int arr[] = {1, 12, 3, 4, 5, -1111};

        // Call the method and print the maximum value in the array
        System.out.println("Max Element in Array is: " + findMax(arr));
    }
}
