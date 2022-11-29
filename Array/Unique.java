public class Unique {
    public static int unique(int arr[]) {
        int n = arr.length;
        // int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                  arr[i]=-1;
                  arr[j]=-1;
                }
                
            }
        }
        
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;  
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,1,3};
       int result= unique(arr);
       System.out.println(result);
    }
}
