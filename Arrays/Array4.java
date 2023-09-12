//sum of the elements in array

import java.util.*;
class Array4
{
	public static void main(String[]args)
	{
		
	int a[]=new int[5];
	Scanner x=new Scanner(System.in);
	System.out.println("Enter 5 numbers");
	for(int i=0;i<a.length;i++)
		a[i]=x.nextInt();

int s=0;
for(int i=0;i<a.length;i++)
	
	s=s+a[i];
System.out.println("sum is"+s);
for(int i=0;i<a.length;i++)
System.out.println("The Elements in the Array "+a[i]);
}
}

