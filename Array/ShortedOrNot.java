public class ShortedOrNot {
    public static boolean sortedornot(int arr[]) {
        int n = arr.length;
        boolean sorted =true;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
               sorted=false;
                break;
            }
         }
        return sorted;
    
    
        
        

    }
    public static void main(String[] args) {
        int arr[]={1,6,6,8,9,10};
        // sortedornot(arr);
        System.out.println(sortedornot(arr));
    }
}
