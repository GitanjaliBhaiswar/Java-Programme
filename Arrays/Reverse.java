//Reverse a numbers
import java.util.*;

class Reverse
{
	public static void main(String[]args)
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int n= x.nextInt();
		
		int rev= 0;
		while(n>0)
		{
			int y = n%10;
			rev = (rev*10)+y;
			n=n/10;
		}
		
		System.out.println("Reverse = "+rev);
	}
}
		
		