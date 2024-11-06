package Arrays;
import java.util.*;
import java.util.Scanner;

public class MAximumconsecutive1s {
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int res=0;
        int curr=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            curr=0;
            else{
                curr++;
                res=Math.max(res,curr);
            }
        }
        System.out.println(res);
    }
}