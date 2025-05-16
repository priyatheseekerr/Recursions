import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(oddSum(n));
        sc.close();
    }

    static int oddSum(int n) {
        if (n == 1)
            return 1;
        return (2 * n - 1) + oddSum(n - 1);
    }

}
