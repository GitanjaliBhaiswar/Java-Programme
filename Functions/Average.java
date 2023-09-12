
//Enter 3 numbers from the user & make a function to print their average.
//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

class Average{
    // public static void  average_three(int a,int b,int c){
    //     int average = (a+b+c)/2;
    //      System.out.println("Average is :"+average);

    public static void odd_nu(int a){
        int sum=0;

        for(int i=0;i<=a;i++){
            if(i%2!=0){
              sum=sum+i;
            }
        
          
         
        }
         System.out.println("Sum of all odd number is :"+sum);
    }
    


    
    public static void main(String[]args){
        // System.out.println("Enter 3 Numbers :");
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        //  average_three(a,b,c);
        odd_nu(a);
    }


    }

