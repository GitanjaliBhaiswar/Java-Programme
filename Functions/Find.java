//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.*;
class Find{
    public static void find_no(int n){
          int i=1;
            if(i<=n){
            System.out.println("Number is positive");
        }
            
        else if(n==0){
                System.out.println("Number is Zero");

            }
        else{
                System.out.println("Number is Negative");

            }

        }
    
    public static void main(String[]args){
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        find_no(n);
       
     }
}

