public class Main {
    public static int findFloor(int arr[],int k) {
        int ans = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > k) {
                break;
            }

            if(arr[i] < k) {
                ans = i;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int result = findFloor(arr, 15);
        System.out.println("Find floor on index : "+result);
        System.out.println("And the number id "+arr[result]);
    }
}