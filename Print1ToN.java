import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        print(n, n);
        sc.close();
    }

    static void print(int n, int i) {
        if (i < 1) {
            return;
        }
        print(n, i - 1);
        System.out.println(i);
    }
}
