import java.util.Scanner;
//Repeat Name for K times 
public class RepeatNamekTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k time to repeat: ");
        int k = sc.nextInt();
        System.out.println("Enter a name: ");
        String name = sc.next();
        print(k, name, 1);
        sc.close();
    }

    public static void print(int k, String name, int count) {
        if (count == k) {
            return;
        }
        System.out.println(name);
        print(k, name, count + 1);

    }
}