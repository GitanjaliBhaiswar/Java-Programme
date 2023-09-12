//check the entered number is prime or not
import java.util.Scanner;
class Prime
{
	public static void main(String[]args)
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n= x.nextInt();
		
		int c= 0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			c++;
		}
		if(c==2)
			System.out.println("Given number is prime");
		else 
			System.out.println("Given number is not prime");
	}
		
}