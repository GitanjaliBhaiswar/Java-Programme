// sort in ascending order and descending order
import java.util.*;


public class Ex2{
   public static void main(String args[]) {
      System.out.println("Enter the size of array:-");
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int a[] = new int[size];

 System.out.println("Enter the Elements in array:-");
      //input
      for(int i=0; i<size; i++) {
          a[i] = sc.nextInt();
      }

       for(int i=0; i<size; i++){
        for(int j=i+1;j<size;j++){
           if(a[j]>a[i]){
           int temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            
           }
        }
       
        }
        for(int j=0;j<size;j++){
            System.out.println(a[j]);
           
       }
  
   }
}

