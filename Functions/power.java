//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.Scanner;
class power{
   
    public static void raise_to_pow(int n,int p){
       int pow =1;
        for(int i=1;i<=p;i++){
             pow=pow*n;

        }
        System.out.println("raise to the power is :"+pow);
    }
     public static void main(String[]args){
        System.out.println("Enter any two numbers :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        raise_to_pow(n,p);
}
}