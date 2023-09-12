
import java.util.*;
class Targetsum{
    //count the number of pair
    static void target_sum(int arr[],int target){
        int ans=0;

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if((arr[i]+arr[j])==target){
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    //count number of triplet
    static void triplet_sum(int arr[],int target){
        int ans=0;

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                if((arr[i]+arr[j]+arr[k])==target){
                    ans++;
                }
            }
        }
        
    }
    System.out.println(ans);
    }

    public static void main(String args[]){
    System.out.println("Enter the size of array :");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int arr[] =new int[size];
    System.out.println("Enter the element of array :");
    //input
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();

    }
    System.out.println("Enter the target Element :");
    int target = sc.nextInt();

     // target_sum( arr, target);
      triplet_sum(arr,target);
}
}
