package NumberSeries;

import java.util.*;

public class primenumber {
    public static int primenumber(int n) {
        if (n <= 1)
            return 0;
        for (int i = 2; i <= n; i++) {
            if (n % 2 == 0) {
                return 0;

            }
        }
        return 1;
    }

    // 'solution 2';

    // static int isPrime(int N){
    // // code here
    // if(N<=1)
    // return 0;
    // if(N==2||N==3)
    // return 1;
    // if(N%2==0)
    // return 0;
    // if(N%3==0)
    // return 0;
    // for(int i=5;i*i<=N;i+=6)
    // {
    // if(N%i==0||N%(i+2)==0)
    // {
    // return 0;

    // }
    // }
    // return 1;
    // }
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    System.out.println(primenumber(n));


}
