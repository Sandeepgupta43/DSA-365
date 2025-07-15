class Main {
    public static int squreRoot(int n) {
        int start = 0;
        int end = n;
        int result = -1;

        while(start < end) {
            int mid = (start+end)/2;
            
            if(mid*mid <= n) {
                result = mid;
                start = mid+1;
            } else {
                end--;
            }
        }

        return result;
    }
    public static void main(String []args) {
        System.out.println(squreRoot(11));
    }
}
