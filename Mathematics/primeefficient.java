package Mathematics;
import java.lang.*;
import java.util.*;
public class primeefficient
 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==2||n==3)
		System.out.println("prime");
		else if(n%2==0)
		System.out.println("Not prime");
		else if(n%3==0)
		System.out.println("Not Prime");
		else
		{
			boolean isprime=true;
			for(int i=5;i*i<=n;i+=6)
			{
				if(n%i==0|| n%(i+2)==0){
				System.out.println("Not Prime");
				isprime=false;
				//break;
				}
			}
			if(isprime==true)
			System.out.println("prime");

			
			
		}
		
		
	}
 }