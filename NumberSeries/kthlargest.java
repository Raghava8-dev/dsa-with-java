package NumberSeries;

import java.util.*;

public class kthlargest {

    public static int kthlargestfactor(int n, int k)

    {
        // if(n%k==0){
        // System.out.println(n/k);
        // }
        for (int i = n; i > 0; i--) {
            if (n % i == 0)
                k--;
            if (k == 0) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(kthlargestfactor(n, k));
    }
}
