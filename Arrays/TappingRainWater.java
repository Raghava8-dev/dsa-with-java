package Arrays;
import java.util.Scanner;
public class TappingRainWater {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int water=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=1;i<n-1;i++)
        {
            int left=arr[i];
            for(int j=0;j<i;j++)
            {
                left=Math.max(left,arr[j]);
            }
            int right=arr[i];
            for(int j=i+1;j<n;j++)
            {
                right=Math.max(right,arr[j]);
            }
            water+=Math.min(left,right)-arr[i];

        }
        System.out.print(water);
       

    }
}
