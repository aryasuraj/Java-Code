public class SumofOE {
    public static void Print(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void sOOE(int arr[]) {
        int n = arr.length;
        int soo=0;
        int soe=0;
        for(int i=0;i<n;i++){
      if(arr[i]%2==0){
           soe = soe+arr[i];
      }
      else{
        soo= soo+arr[i];
      }
}
    System.out.println(soe +"     " + soo);


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        sOOE(arr);

    }
}
