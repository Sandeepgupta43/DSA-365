class Main {
    public static void inserstionSort(int arr[]) {
        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[i];
                j--;
            }
            arr[j+1] = curr;
        }
    }

    public static void main(String args[]) {
        int arr[] = {5,2,6,2,1,9};
        inserstionSort(arr);    
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
