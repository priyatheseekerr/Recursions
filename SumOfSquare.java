import java.util.Scanner;

public class SumOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        System.out.println(squareSum(n));
        sc.close();
    }

    static int squareSum(int n) {
        if (n == 1)
            return 1;
        return n * n + squareSum(n - 1);
    }

}
