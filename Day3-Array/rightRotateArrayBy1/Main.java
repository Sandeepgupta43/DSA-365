class Main {
  public static void rotateArray(int arr[]) {
    int n = arr.length;
    int temp = arr[0];

    for(int i=0; i<n-1; i++) {
      arr[i] = arr[i+1];
    }
    arr[n-1] = temp;
  }
  public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};
        rotateArray(arr);
        for (int i : arr) {
          System.out.print(i + " ");
        }
  }
}
