package NumberSeries;

import java.util.Scanner;

public class gcd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            temp = n1;
        }
        System.out.println(n1);

    }
}