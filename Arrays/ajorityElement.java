package Arrays;
import java.util.Scanner;
public class ajorityElement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        int freq[]=new int[maxElement+1];
        
        for(int i=0;i<n;i++)
        {
            
            freq[arr[i]]++;
        }
        boolean found=false;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]>n/2){
                System.out.println(i);
                found=true;
            }

        }
        if(found==false){
        System.out.println("no majority element");
        }
    }
}
