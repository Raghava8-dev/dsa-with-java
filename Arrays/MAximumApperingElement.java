package Arrays;
import java.util.Scanner;
public class MAximumApperingElement {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++)
        {
            left[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            right[i]=sc.nextInt();
        }
        int freq[]=new int[100];
        for(int i=0;i<n;i++)
        {
            for(int j=left[i];j<=right[i];j++)
            {
              freq[j]+=1;
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(freq[res]<freq[i])
            {
                res=i;
            }
        }
        System.out.println(res);

    }
}
