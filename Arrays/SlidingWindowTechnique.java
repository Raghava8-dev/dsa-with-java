package Arrays;
import java.util.Scanner;
public class SlidingWindowTechnique {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int curr=0;
        for(int i=0;i<k;i++){
           curr+=arr[i];
        }
        int res=curr;
        for(int i=k;i<n;i++)
        {
            curr=curr+arr[i]-arr[i-k];
            res=Math.max(curr,res);
        }
        System.out.println(res);

        


    }
}
