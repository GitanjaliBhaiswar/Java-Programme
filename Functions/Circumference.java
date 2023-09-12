import java.util.*;

 class Circumference{
    public static void circum(int r){
    double c = (2*r*3.14);
    System.out.println("Circumference is :"+c);
    }
    
     public static void main(String[]args){
        System.out.println("Enter radius:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        circum(r);
     }


}