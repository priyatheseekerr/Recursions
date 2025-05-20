import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length if the array:");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, len, 0);
        sc.close();
    }

    static void reverse(int[] arr, int n, int i) {
        if (i >= n / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(i, n - i - 1, arr);
        reverse(arr, n, i + 1);
    }

    static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
