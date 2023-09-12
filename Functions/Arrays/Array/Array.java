//sum of array elements
import java.util.*;
class Array{
public static void main(String args[]){
    System.out.println("Enter the size of array");
    Scanner sc=new Scanner(System.in);
    int size= sc.nextInt();

    int arr[]=new int[size];
    //input
     System.out.println("Enter the elements of array :");
    for(int i=0;i<size;i++){
       arr[i] = sc.nextInt();
    }
    //output
   for(int i=0;i<size;i++){
     System.out.println(arr[i]);
   }
   System.out.println("Enter the elements to be found array :");
   int n = sc.nextInt();
     for(int i=0;i<size;i++){
        if(n==arr[i]){
             System.out.println("Element present on"+i+"index");

        }
     
        }
        
     
     


    // int sum=0;
    //  for(int i=0;i<size;i++){
    //     sum=sum+arr[i];
    //  }
    //      System.out.println("Sum of the array is:"+sum);

}
}
