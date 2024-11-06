
import java.util.Scanner;
import java.util.regex.*;

public class ValidateThePasswordChecker {
    public static boolean isValidPassword(String password) {

        if (password.length() < 8 || password.length() > 15) {
            return false;
        }

        if (password.contains(" ")) {
            return false;
        }

        if (!password.matches(".*\\d.*")) {
            return false;
        }

        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        if (!password.matches(".*[@#%&!$].*")) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password to check:");
        String s = sc.nextLine();

        if (isValidPassword(s)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
