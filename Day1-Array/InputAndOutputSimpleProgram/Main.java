import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] =  new int[5];

        System.out.println("Enter 5 numbers : ");
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Element : ");
        for(int i:arr) {
            System.out.print(i+" ");
        }


        sc.close();
    }
}