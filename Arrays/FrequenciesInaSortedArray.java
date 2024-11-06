package Arrays;
import java.util.Scanner;
public class FrequenciesInaSortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int freq = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                freq++;
            }
            else {
                System.out.println("Frequency of "
                                   + arr[i - 1]
                                   + " is: " + freq);
                freq = 1;
            }
        }

        System.out.println("Frequency of " + arr[n - 1]
                           + " is: " + freq);
    }
    }
