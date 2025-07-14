import java.util.ArrayList;

class Main{
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int start = 0;
        int end = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        int curr = 0;
        for(int i=0; i<arr.length; i++) {
            curr += arr[i];
            
            
            if(curr >= target) {
                end = i;
                
                while(curr > target && start < end) {
                    curr -= arr[start];
                    ++start;
                }
                
                if(curr == target) {
                    res.add(start+1);
                    res.add(end+1);
                    
                    return res;
                }
            }
        }
        
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 7, 5};
        int target = 12;

        System.out.println("Subarray with sum : "+subarraySum(arr, target));
    }
}