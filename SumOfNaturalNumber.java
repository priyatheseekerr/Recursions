import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
        sc.close();
    }

    static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}
