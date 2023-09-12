import java.util.Scanner;
class Swap{
// swap two numbers using sum and difference method
public static void sum_diff(int x,int y){
    System.out.println("Before Swapping :" );
    System.out.println("x="+x);
    System.out.println("y="+y);

    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("After Swapping :" );
    System.out.println("x="+x);
    System.out.println("y=" +y);

}

    public static void main(String []args){
   Scanner sc =new Scanner(System.in);
     System.out.println("Enter two numbers :" );
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Before Swapping :" );
   System.out.println("a="+a);
    System.out.println("b=" +b);

    int temp =a;
    a=b;
    b=temp;
    System.out.println("After Swapping by using temp variable:" );
    System.out.println("a="+a);
    System.out.println("b=" +b);

   Scanner obj =new Scanner(System.in);
   System.out.println("Enter two numbers x and y :" );
    int x = obj.nextInt();
    int y = obj.nextInt();
    sum_diff(x, y);

}
}

