import java.util.*;

class factorial{

    
    public static int fact(int n){
        int f=1;
        for(int i=n;i>1;i--){
            f=f*i;
            
        }
        return f;
    }
        public static void main(String args[]){
            System.out.println("Enter a number =");
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();

            int f =fact(n);

            System.out.println(f);
        }
    }

    
