import java.util.Arrays;

public class LargestSmaller {
    
    public static int[] LG(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
      int ans[]={arr[0],arr[n-1]};
      return ans;
        
    }
   
    public static void main(String[] args) {
        int arr[]={1,5,3,7,6,2};
        // LG(arr);
        int ans[]=LG(arr);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
        
    }
}
