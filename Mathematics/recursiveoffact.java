package Mathematics;

public class recursiveoffact {
    public static int factorial(int n)
    {
      if(n==0)
      return 1;
      return n*factorial(n-1);

    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(factorial(9));
    }
}
