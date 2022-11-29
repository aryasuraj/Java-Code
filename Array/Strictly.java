public class Strictly {
    public static void strictlygreater(int arr[],int x) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>x){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,4,6,8,9,1};
        strictlygreater(arr, 4);
    }
}
