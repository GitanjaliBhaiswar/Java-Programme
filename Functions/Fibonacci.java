import java.util.Scanner;
class Fibonacci{
    public static int fib(int n)
    {
        if (n <= 1)
            return n;
      return fib(n - 1) + fib(n - 2);
    //  System.out.println("fibonacci serie is:"+fibo);
    }

      public static void main(String[]args){
        System.out.println("Enter any  numbers :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=fib(n);
        System.out.println("fibonacci series is:"+x);
    
}
}
