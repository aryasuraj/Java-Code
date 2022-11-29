public class TargetTriplet {
    public static int tripletTarget(int arr[],int target) {
        int n = arr.length;
        int count=0;
        for(int i =0;i<n;i++){
            for(int j=i+1;j<n;j++){
               for(int k =i+j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    count++;
                }
               }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr []= {1,4,5,6,3};
        int result =tripletTarget(arr, 8);
        System.out.println(result);
    }
}
