package Mathematics;

public class computingpow {
    public static void main(String[] args) {
        int a=25;
        int b=2;
        System.out.printf("%d",pow(a, b));
        

    }
    public static int pow(int a,int b)
    {
        int temp;
        if(b==0)
        return 1;
        temp=pow(a,b/2);
        if(b%2==0)
        return temp*temp;
        else
        return a*temp*temp;
    }
}
