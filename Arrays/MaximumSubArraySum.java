package Arrays;
import java.util.*;
import java.util.Scanner;

public class MaximumSubArraySum {
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int res=arr[0];
    int maxending=arr[0];
    for(int i=0;i<n;i++)
    {
        maxending=Math.max(maxending+arr[i],arr[i]);
        res=Math.max(maxending,res);


    }
    System.out.print(res);
  }

}

/*basic approch
int res=arr[0];
for(int i=0;i<n;i++)
{
    int cur=0;
    for(int j=i;j<n;j++)
    {
        cur+=arr[j];
        res=Math.max(res,cur);
    }
    System.out.println(res);
}*/
