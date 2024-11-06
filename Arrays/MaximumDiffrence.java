package Arrays;
import java.util.Scanner;

public class MaximumDiffrence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxdif=0;
        for(int i=0;i<n;i++)
        {
            
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]-arr[i]>maxdif)
                {
                    maxdif=arr[j]-arr[i];
                   
                }
                
            }
           
        }
        System.out.print(maxdif);
       
    }
}
