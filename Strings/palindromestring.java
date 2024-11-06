
import java.util.Scanner;

public class palindromestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int start = 0;
        int end = n - 1;
        boolean ispalindrome = true;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                System.out.println("Not palindrome");
                ispalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (ispalindrome == true)
            System.out.println("Palindrome");
    }
}