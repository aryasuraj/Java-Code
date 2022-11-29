

public class Rotate {
    public static int[] rotate(int arr[],int k) {
         int n = arr.length;
         k=k%n;
        int ans [] = new int[n];
        int j=0;
        for(int i=n-k;i<n;i++){
            ans[j++]=arr[i];
            // j++;
        }
        for(int i=0;i<n-k;i++){
            ans[j++]=arr[i];
            // j++;
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5} ;
        int ans[]=rotate(arr, 400);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(ans[i]);
        }
    }
}
