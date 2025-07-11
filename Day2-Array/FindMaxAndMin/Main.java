
public class Main {
    public static void findMaxAndMin(int arr[]) {
        int max = arr[0];
        int min = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            } 
            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Max : "+max+" and Min : "+min);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,2,4,2,3,44,23,4};
        findMaxAndMin(arr);
    }
}
