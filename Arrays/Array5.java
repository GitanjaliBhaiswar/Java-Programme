	/* Create	an	Array	of	size	10	of	integers.	Take	input	from	the	user	for	these	
elements	and	print	the	entire	array	after	that.*/

import java.util.*;
public class Array5
{
	public static void main(String[]args)
	{
		
		
		int a[]=new int [10];
		Scanner x = new Scanner(System.in);
		System.out.println("Enter 10 elements: ");
		for(int i=0;i<a.length;i++)
		{
		a[i] = x.nextInt();
		}
	    for(int i=0;i<a.length;i++)
		{
	    System.out.println("Array Elements are :"+a[i]);
		}
	
	}
}
		
		
	