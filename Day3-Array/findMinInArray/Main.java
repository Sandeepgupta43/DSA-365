// Java program to find the minimum element in an array

class Main {

    /**
     * This method finds the minimum element in the given array.
     *
     * @param arr The input array of integers
     * @return The minimum value found in the array
     */
    public static int findMin(int arr[]) {
        // Initialize min with the first element of the array
        int min = arr[0];

        // Loop through the array to compare and find the smallest value
        for (int i = 0; i < arr.length; i++) {
            // If the current element is smaller than min, update min
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Return the smallest value found
        return min;
    }

    public static void main(String[] args) {
        // Sample array
        int arr[] = {1, 12, 3, 4, 5, -1111};

        // Call the method and print the result
        System.out.println("Min Element in Array is: " + findMin(arr));
    }
}
