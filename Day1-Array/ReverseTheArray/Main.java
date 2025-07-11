package ReverseTheArray;

public class Main {
    public static void reverse(int arr[]) {
        int n = arr.length;
        for(int i=0; i<n/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,9,0,3,17,1}; // 1,17,3,0,9,2,5,1

        reverse(arr);

        System.out.print("Array after Reversing : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
