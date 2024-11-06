
import java.util.Scanner;

public class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int vowel = 0, consonant = 0, digit = 0, specialchar = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                c = Character.toLowerCase(c);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }

            } else if (c >= '0' && c <= '9')

            {
                digit++;
            } else {
                specialchar++;
            }

        }
        System.out.println(vowel);
        System.out.println(consonant);
        System.out.println(digit);
        System.out.println(specialchar);
    }
}