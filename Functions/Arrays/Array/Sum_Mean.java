// WAP to read an array of 5 integer and find the sum and mean of all the elemnts in the array

import java.util.Scanner;
class Sum_Mean{
    public static void main(String args[]){
         int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size =sc.nextInt();
       

 System.out.println("Enter the elements in  array :");

        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        
        }
        //output
        for(int i=0;i<size;i++)
        System.out.println("a[i]:"+i);

    }
}
