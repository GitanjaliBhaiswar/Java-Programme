//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

 class Greater{
    public static void greater_no(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("Greater is:"+a);
        }
        else if(b>a && b>c){
             System.out.println("Greater is:"+b);
        }
        else{
            System.out.println("Greater is:"+c);

        }


    }

     public static void main(String[]args){
        System.out.println("Enter three Numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
         int c = sc.nextInt();

        greater_no(a,b,c);
     }

}