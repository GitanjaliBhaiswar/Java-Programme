import java.util.*;

class Even{
    public static void Even(int n){
       if(n%2==0)
       {
        System.out.println("No. is Even");
       }
       else
       {
        System.out.println("No. is odd");
       }
    }



    public static void main(String args[]){
     System.out.println("Enter a number =");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            Even(n);

    }
}