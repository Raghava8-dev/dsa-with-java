
import java.util.Scanner;

public class removeallcharactersotheralphabets {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();

    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
        System.out.print(c);
      } else {
        continue;
      }

    }

  }
}
