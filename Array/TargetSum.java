public class TargetSum {
    public static int targetSum (int arr[],int target) {
        int n = arr.length;
        int ans=0;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
               ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr []= {1,4,6,7,3,2,5};
       int result= targetSum(arr, 6);
       System.out.println(result);
    }
}
