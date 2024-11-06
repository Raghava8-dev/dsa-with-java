package NumberSeries;

import java.util.Scanner;

public class StandarddeviationOfgivenInteger {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        double mean;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        mean = sum / n;
        double variance = 0;
        for (int i = 0; i < n; i++) {
            variance += Math.pow(arr[i] - mean, 2);

        }
        variance /= n;

        double standarddeviation = Math.sqrt(variance);
        System.out.printf("%.2f", standarddeviation);

    }
}
