
import java.util.Scanner;

public class removecharacteer {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    int n1 = s1.length();
    int n2 = s2.length();
    String t = "";
    int arr[] = new int[26];
    for (int i = 0; i < n2; i++) {
      arr[s2.charAt(i) - 'a'] = -1;
    }
    for (int i = 0; i < n1; i++) {
      if (arr[s1.charAt(i) - 'a'] != -1) {
        t += s1.charAt(i);
      }

    }
    System.out.println(t);
  }
}