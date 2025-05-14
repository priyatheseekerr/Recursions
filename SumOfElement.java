import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(sum( arr,n));
        sc.close();
    }
    static int sum(int[] arr,int n){
        if (n == 0)
        return 0;
    return arr[n - 1] + sum(arr, n - 1);
    }
}
