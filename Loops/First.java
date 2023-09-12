//check the largest numbers
import java.util.*;
class First
{
    public static void main(String[]args)
    {
		Scanner x = new Scanner(System.in);
        System.out.println("Enter a numbers:");
		int a = x.nextInt();
		int b = x.nextInt();
		int c = x.nextInt();
		
		
		if(a>b&&a>c)
			System.out.println("a is Largest");
		else if (b>a&&b>c)
			System.out.println("b is largest");
		else 
			System.out.println("c is largest");
    }
}