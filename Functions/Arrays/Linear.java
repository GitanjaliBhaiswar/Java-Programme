// Linear Regression

import java.util.*;

class linear{
    public static void main(String args[]){
    System.out.println("Enter the size of Array:-");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int number[] = new int[size];
    //input
    System.out.println("Enter the element in array :-");
    for(int i=0;i<size;i++){
        number[i] = sc.nextInt();
       

    }
      System.out.println("Element to find:");
    int x = sc.nextInt();
  //output
     for(int i=0;i<size;i++){
       // System.out.println("Elements in the array is:-"+ number[i]);
         if(number[i]==x){
               System.out.println("Elements found at locataion:-"+i);
        }

     }
    



}
}