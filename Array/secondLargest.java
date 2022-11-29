public class secondLargest {
    
    public static int secondlargest(int arr[]) {
        int n = arr.length;
        int max1=Integer.MIN_VALUE;
        // int max2=-234;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        return max1;
    }
    public static void main(String[] args) {
        int arr []={1,4,2,6,9,7};
       int res= secondlargest(arr);
       System.out.println(res);
    }
}
