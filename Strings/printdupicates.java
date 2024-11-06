
public class printdupicates {
    public static void printDuplicateCharacters(String s) {
        int[] count = new int[256]; // Assuming ASCII character set

        // Count the occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        // Print characters with count greater than 1
        for (int i = 0; i < 256; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + ", count = " + count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String s = "raghavaishandsome";
        printDuplicateCharacters(s);
    }
}
