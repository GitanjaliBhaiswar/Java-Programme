import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		System.out.println("Enter a number: ");
		Scanner x= new Scanner(System.in);
		int n = x.nextInt();
		
		int i =1 ,f=1;
		while(i<=n)
		{
			f=f*i;
			i++;
		}
		System.out.println("Factorial is :"+f);
	}
}