package Arrays;
import java.util.Scanner;

public class RemoveDuplicatesFromaSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       int res=1;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[res-1]!=arr[i]){
            arr[res]=arr[i];
            res++;


        }
        
       }
       for(int j=0;j<res;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }
}
