package Arrays;
import java.util.*;
import java.util.Scanner;
public class secondlargest {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int seecmax=arr[0];
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>max)
        {
            seecmax=max;
            max=arr[i];
        }
        else if(arr[i]>seecmax&&arr[i]<max)
        {
            seecmax=arr[i];
        }
    }
    System.out.println(seecmax);
   } 
}
