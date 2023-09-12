import java.util.*;

// Write a Java program to test the equality of two arrays.
    
class Equality{
     public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
            int size = scan.nextInt();
            boolean ans = false;
            int[] arr1 = new int[size];
            int[] arr2 = new int[size];
             System.out.println("Enter the Elements in array1: ");
              for(int i = 0; i < size; i++){
               arr1[i] = scan.nextInt();
            }
                System.out.println("Enter the Elements in 2: ");
                for(int i = 0; i < size; i++){
                arr2[i] = scan.nextInt();
                if(arr2[i] == arr1[i]){
                 ans = true;
                   break;
}
}
System.out.print(ans);
}

}