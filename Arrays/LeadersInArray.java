package Arrays;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++)
        {
            int j;
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                break;
            }
            if(j==n)
            System.out.print(arr[i]+" ");
            }
        }
    }

