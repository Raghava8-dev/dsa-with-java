package Stackss;

import java.util.*;

public class balanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with parentheses: ");
        if (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            if (isBalanced(s)) {
                System.out.println("The parentheses in the string are balanced.");
            } else {
                System.out.println("The parentheses in the string are not balanced.");
            }
        }
    }

    public static boolean isBalanced(String s) {
        ArrayDeque<Character> d = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                d.push(ch);
            else {
                if (d.isEmpty())
                    return false;
                else if (ch == ')' && d.peek() != '(')
                    return false;
                else if (ch == ']' && d.peek() != '[')
                    return false;
                else if (ch == '}' && d.peek() != '{')
                    return false;
                else
                    d.pop();
            }

        }
        return d.isEmpty();

    }
}