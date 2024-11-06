
import java.util.*;

public class removeduplicatesfromastring {
    public static String rremoveduplicates(String s) {
        HashSet<Character> present = new HashSet<>();
        StringBuilder st = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!present.contains(c)) {
                st.append(c);
                present.add(c);
            }

        }
        return st.toString();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(rremoveduplicates(s));
    }
}
