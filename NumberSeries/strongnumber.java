package NumberSeries;

import java.util.Scanner;

public class strongnumber {
    public static int fact(int n) {
        if (n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static int stongnumber(int N) {
        int s = N;
        int sum = 0;
        while (s != 0) {
            int temp = s % 10;
            sum = sum + fact(temp);
            s = s / 10;
        }
        if (sum == N)
            return 1;
        return 0;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(stongnumber(N));

    }
}
