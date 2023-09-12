import java.util.*;
//find the unique element
class Manupulation{
    static int manupation(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            
            }
        }
       int ans=-1;
              for(int i=0;i<arr.length;i++){
                if (arr[i]>0){
                    ans=arr[i];  
                }
        }
        return ans;

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
    System.out.println("UNIQUE ELEMENT :"+manupation(arr)); 
}
     

}
