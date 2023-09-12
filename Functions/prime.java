import java.util.*;

class prime{
   
    public static void prime_no(int n){
        int count = 0; 
        for (int i = 1; i <= n ; i++) {
        if (n % i == 0) {
        count++;
      }
    }

    if (count==2) {
        System.out.println("The number is  prime");
    }
    else {
      System.out.println("The number is not prime");
    }
  }
   public static void main(String args[]){
            System.out.println("Enter a number =");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            prime_no(n);


    }

}