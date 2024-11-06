
import java.util.Scanner;

public class NonRepeatingcharacter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count[] = new int[26];
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                System.out.println(s.charAt(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
