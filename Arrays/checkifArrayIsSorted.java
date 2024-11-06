package Arrays;
import java.util.Scanner;
public class checkifArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean found=true;
        for(int i=1;i<arr.length;i++)
        {
           
            if(arr[i-1]>arr[i])
            {
              found=false;
            }
           
        }
        if(found==true)
        {
            System.out.println("sorted");

        }
        else{
            System.out.println("not sorted");
        }

    }
}
