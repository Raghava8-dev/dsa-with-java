
public class lexicographicallynextString {
    public static String nextString(String s) {
        // int n=s.length();
        char arr[] = s.toCharArray();
        for (int i = arr.length; i >= 0; i--) {
            if (arr[i] != 'z') {
                arr[i]++;

                return new String(arr);
            } else {
                arr[i] = 'a';
            }

        }
        return s + 'a';

    }
}
