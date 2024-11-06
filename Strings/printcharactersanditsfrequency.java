
import java.util.*;

public class printcharactersanditsfrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int arr[] = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;

        }
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i) - 'a'] != 0) {
                System.out.print(s.charAt(i));
                System.out.print(arr[s.charAt(i) - 'a'] + " ");
                arr[s.charAt(i) - 'a'] = 0;
            }
        }

    }
}