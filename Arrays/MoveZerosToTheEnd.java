package Arrays;
import java.util.Scanner;
public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        int i;
        int count=0;
        for(i=0;i<arr.length;i++)
        {
            
            if(arr[i]!=0){
                arr[count++]=arr[i];
                System.out.print(arr[i]+" ");
            }
           
        }
        for( i=count;i<arr.length;i++)
        {
            arr[i]=0;
           System.out.print(arr[i]+" ");
           
        }
       


        }
    }

