class Main {
    public static void sort012(int arr[]) {
        int lo = 0;
        int mid = 0;
        int hi = arr.length-1;


        while (mid <= hi) {

            if(arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2};
        sort012(arr);
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
