
import java.util.Scanner;

public class SumOfNumbersInString {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    int sum = 0;
    String temp = "0";
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (Character.isDigit(c)) {
        temp = temp + c;

      } else {
        sum = sum + Integer.parseInt(temp);
        temp = "0";

      }

    }
    System.out.print(sum + Integer.parseInt(temp));
  }
}