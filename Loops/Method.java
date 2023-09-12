class Method
/*{
	public static void main(String args[])
	{
	cube(9);
	cube(8);
}
public static void cube(int n)
{
	int c = n*n*n;
	System.out.println("Square of " + n + "is " +c);
}
*/
{
	public static void main(String[]args)
	{
		double a = area(5.2);
		System.out.println("Area of circle is "+a);
		
		double c = circumference(5.2);
		System.out.println("Circumferene of circle is "+a);
	}
	public static double area(double r)
	{
		return(3.14*r*r);
	}
	public static void circumference(double r)
	{
		return(2*3.14*r);
	}
}
		
