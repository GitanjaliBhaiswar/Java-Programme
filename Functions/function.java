// Print Given name in function
import java.util.*;


class function{
    public static void myName(){
        System.out.println("Gitanjali Bhaiswar");
        
    } 
    public static int addition(int a,int b){
        int sum=a+b;
        
        return sum;
    }
    public static void main(String args[]){
        System.out.println("Enter two numbers");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        
       int sum = addition(a,b);
        System.out.println(sum);
        
      
        myName();
    }

}