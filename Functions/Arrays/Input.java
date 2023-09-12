import java.util.Scanner;

class Input{
    public static void output(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

  
    public static void main(String args[]){
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int arr[]=new int[size];
        System.out.println("Elements in the array is : ");
        //input
          for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
          }
        
        System.out.println("Elements in the original array : ");
        // output
        output(arr);
        // for(int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        // }

// Creating duplicate array
// not form actual array copy OR SHALLOW COPY
        //int arr2[]=arr;
// DEEP copy
        int arr2[]=arr.clone();
         System.out.println("Elements in the duplicate array : ");
        // output
        output(arr2);

        arr2[0]=0;
        arr2[1]=0;
        System.out.println("Elements in the original array after changing value ");
        output(arr);
        System.out.println("Elements in the duplicate array after changing value : ");
        output(arr2);
    }
}