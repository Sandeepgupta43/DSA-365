package LargestElement;

class Main{
    public static int largest(int arr[]) {
        int result = arr[0];

        for(int i=1; i<arr.length; i++) {
            if(arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,9,0,3,17};
        System.out.println("Largest num : "+largest(arr));
    }
}