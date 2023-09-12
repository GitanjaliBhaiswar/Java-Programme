import java.util.*;

class Sort{
    public static boolean isSorted(int arr[]){
        boolean check = true;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                check = false;
            }
        
          }
          System.out.println(check);

          return check;
    }

public static int [] smallestAndlargest(int arr[]){
      Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
          }
          int ans[]= {arr[0],arr[arr.length-1]};
       
 return ans;
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
       
       
        isSorted(arr);
       int ans[]= smallestAndlargest(arr);
     
         System.out.println( "Smallest is : "+ans[0]);
          System.out.println( "Largest is : "+ans[1]);
        
        }

    }
