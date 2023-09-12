class Array2
{
	public static void main(String[]args)
	{
		Person p[] =new Person[2];
		
		p[0]=new Person("Aman",20);
		p[1]=new Person("man",21);
		p[2]=new Person("Amay",30);
		
		for(int i; i<=p.length; i++)
			p[i].showData();
	}
}

class Person
{
	String N;
	int A;
	
	public Person(String n, int a)
	{
		N=n;
		A=a;
	}
	public void showData()
	{
		System.out.println("Enter your name :"+N);
		System.out.println("Enter your age :"+A);
		
	}
}

		