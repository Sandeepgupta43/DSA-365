class Main {
    public static int noOfCount(int arr[],int key) {
        int count = 0;

        for(int i:arr) {
            if(i == key) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,3,2,1,3,42,2,1,1};
        System.out.println("Number of Count : "+noOfCount(arr, 2));
    }
}
