public class LastOccurance {
    public static void lastOccurance(int arr[],int x) {
        int n = arr.length;
        int lastIndex=-1;
        for(int  i=0;i<n;i++){
        if(arr[i]==x){
            lastIndex=i;
        }
        }
        System.out.println(lastIndex);
    }
    public static void main(String[] args) {
        int arr[]={2,5,7,5,7,5,6,5,7};
        lastOccurance(arr, 97);

    }
}
