class Demo2{
    // public static void max_array(){
    //     int arr[] = {2,6,8,9,56,78};
    //     int ans=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>ans){
    //             ans=arr[i];
    //         }

    //     }
    //     System.out.println(ans);
        
    // }
    public static void search(){
     
        int arr[] = {2,60,8,60,56,78};
        int x=60;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
               ans=i;
               break;

            }
        }
        if(ans ==-1) {
                System.out.println("Element is not found");
        }   
        else{
                System.out.println("Element is at "+x +" with index "+ans);
        }

    }

  




    public static void main(String args[]){
        // int arr[]={1,2,3,4,5,6,7,8,56,67};
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum = sum +arr[i];
        // }
        // System.out.println(sum);
        //max_array();
        search();


    }
}
