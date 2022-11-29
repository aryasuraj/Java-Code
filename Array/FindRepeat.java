public class FindRepeat {
    public static int Repeat(int arr[]) {
        int n = arr.length;
        int ans=-1;
        for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                // return arr[i];
                ans =arr[j];
            }
          }
        }
        // return -1;
        return ans;
    }
    public static void main(String[] args) {
        int arr []={1,6,3,4,7,4,6,3,7};
       int res= Repeat(arr);
       System.out.println(res);
    }
}
