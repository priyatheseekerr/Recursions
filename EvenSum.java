import java.util.Scanner;

public class EvenSum {
    static int evenSum(int n) {
        if (n == 1)
            return 2;
        return 2 * n + evenSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(evenSum(n));
        sc.close();
    }
}
