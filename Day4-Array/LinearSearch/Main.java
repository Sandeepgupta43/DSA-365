class Main {
    public static int findIndex(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println("Index of key : "+findIndex(arr, 5));
    }
}
