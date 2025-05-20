import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word=sc.nextLine();
        int len=word.length();
        if(reverse(word,len,0))
        System.out.println("The string is palindrome");
        else System.out.println("The string is not palindrome");
        
        sc.close();

    }
    static boolean reverse(String word,int len,int i){
        if(i>=len/2){
            return true;
        }
        if(word.charAt(i)!=word.charAt(len-i-1)){
            return false;
        }
        return reverse(word, len, i+1);
        

    }
}
