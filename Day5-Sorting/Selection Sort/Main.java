
class Main {
    public static void selectionSort(int arr[]) {

        for(int i=0; i<arr.length; i++) {
            int smallest = i;

            for(int j=i+1; j< arr.length; j++) {
                if(arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;

        }
    }
    public static void main(String[] args) {
        int arr[] = {5,2,6,2,1,9};
        selectionSort(arr);

        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
}
