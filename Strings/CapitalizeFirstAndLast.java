
import java.util.Scanner;

public class CapitalizeFirstAndLast {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    char c[] = s.toCharArray();
    for (int i = 0; i < n; i++) {
      int k = i;
      while (i < c.length && c[i] != ' ')
        i++;
      c[k] = Character.toUpperCase(c[k]);
      c[i - 1] = Character.toUpperCase(c[i - 1]);

    }
    System.out.print(new String(c));

  }
}
