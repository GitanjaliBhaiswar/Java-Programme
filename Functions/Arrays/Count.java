import java.util.*;
class Count{

    public static void lastOccurance(int arr[],int x){
       int lindex=-1;
         for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lindex=i;
            }
         }
         System.out.println("last index of "+x+"is :"+lindex);
    }
// count the no. of elements whose value is greater than x
    public static void greater(int arr[],int x){
        int count=0;
          for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("count of greater than "+ x +" is:"+count);
    }
    public static void main(String args[]){
        System.out.println("Enter the size of array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        
        int arr[]=new int[size];
        System.out.println("Enter the Elements is : ");
        
        //input
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
       
        System.out.println("Enter the x :");
        int x= sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
    
        System.out.println("count of "+ x +" is:"+count);

        lastOccurance(arr, x);
        greater(arr, x);
    }
}