
public class ReverseArray {
    public static void reverseInPlace(int arr[],int start,int end) {
        while (start < end) {
            int temp = arr[start-1];
            arr[start-1] = arr[end-1];
            arr[end-1] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverseInPlace(arr, 1, 6);
        for(int i: arr) {
            System.out.print(i + " ");
        }
    }
}
