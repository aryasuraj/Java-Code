public class Rotateforn {
    public static void Print(int arr[]) {
        int n =arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        
    }
    public static void Reverse(int arr[],int i,int j) {
        while(i<j){
            // swap(arr,i,j);
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        
    }
    public static void Rotate(int arr[],int k) {
        int n = arr.length;
        k=k%n;
        Reverse(arr,0,n-k-1);
        Reverse(arr,n-k,n-1);
        Reverse(arr,0,n-1);
        
    }
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6,7};
        Rotate(arr, 5);
        Print(arr);
    }
}
