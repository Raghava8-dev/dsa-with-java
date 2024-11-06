
import java.util.*;

public class maximumoccuringchar {
    public static char maximumoccuringchar(String s) {
        int n = s.length();
        int freq[] = new int[256];
        int maxfreq = 0;
        char maxoccur = '\0';
        char ch;
        for (int i = 0; i < n; i++) {

            ch = s.charAt(i);
            freq[ch]++;

            if (freq[ch] > maxfreq) {
                maxfreq = freq[ch];
                maxoccur = ch;
            }
        }
        return maxoccur;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(maximumoccuringchar(s));

    }

}
