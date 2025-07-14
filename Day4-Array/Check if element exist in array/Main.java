class Main {
    public static boolean ifExist(int arr[],int k) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == k) return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,23,4,5,6,7,8,9};
        System.out.println("5 is exist in array: "+ifExist(arr, 5));
    }
}
