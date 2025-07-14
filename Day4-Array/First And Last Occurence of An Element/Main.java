import java.util.ArrayList;

class Main {
    public static int firstOccurence(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start <= end) {
            int mid = (start+end)/2;
            System.out.println("In first "+mid);

            if(arr[mid] == key) {
                result = mid;
                end = mid - 1;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static int lastOccurence(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start <= end) {
            int mid = (start+end)/2;
            System.out.println("In last "+mid);

            if(arr[mid] == key) {
                result = mid;
                start = mid + 1;
            } else if(arr[mid] < key) {
                start = mid+1;
            } else {
                end = mid - 1;
            }
        }

        return result;
    }

    public static ArrayList<Integer> firstAndLastoccurence(int arr[], int k){
        int first = firstOccurence(arr, k);
        int last = lastOccurence(arr, k);

        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);

        return res;
    }

    public static void main(String []args) {
        int arr[] = {1,2,3,4,4,4,5,6};
        System.out.println("First And last occurence : "+firstAndLastoccurence(arr, 4));
    }
}
