
/*Check wheather the given number is paliandrome or not*/


import java.util.*; 
class Paliandrome
{
	public static void main(String[]args)
	{
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = x.nextInt();
		int rev=0;
		int org_num=n;
		
		while(n!=0)
		{
		 rev = rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("Paliandrome Number");
		}	
		else 
		{
			System.out.println("NOT Paliandrome Number");
		}
	}
}