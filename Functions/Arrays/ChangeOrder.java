
import java.util.*;
class ChangeOrder{
    
/*Given an unsorted array arr[] of size N having both negative and positive integers, place
all negative elements at the end of array without changing the order of positive elements
and negative elements*/
  public static void elements(int arr[]){
     int count =0;
        
         int b[] = new int[100];
            
         for(int i=0; i<arr.length;i++){
             if(arr[i]>0){
                count++;
             b[count] = arr[i];
         System.out.println(b[count]);
          

             }
       
         }
         for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                count++;
             b[count] = arr[i];
           System.out.println(b[count]);
            }

         }

      /*Given an array arr[] and an integer K where K is smaller than size of array, the task is to
find the Kth smallest element in the given array. It is given that all array elements are
distinct.*/
    }
    public static void ksmallest(int []arr){
     System.out.println("Enter the K th element : ");
     Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
         
         Arrays.sort(arr);
          System.out.println("Kth smallest element in the given array is : "+arr[k-1]);
     

    }


    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of array is : ");
        int size = sc.nextInt();
         int arr[]=new int[size];
        System.out.println("Enter the Elements is : ");
        
        //input
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
       
       //elements(arr);
       ksmallest(arr);
     
}
}