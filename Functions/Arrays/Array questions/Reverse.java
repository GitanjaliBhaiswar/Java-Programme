class Reverse{
    public static void main(String args[]){
        int a[]={2,3,4,5,6,7,8};
        int n = a.length;
        for(int i =0;i<n;i++){
        System.out.println(a[i]);
        }

  System.out.println("Reverse order");
    for(int i=n-1;i>=0;i--)
    {
        System.out.println(a[i]);

    }  
     }
     
}