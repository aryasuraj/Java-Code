public class InsertionSort {
    public static void Print(int arr[]) {
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void insertionSort(int arr[]) {
        int n=arr.length;
        for(int i=1;i<n;i++){
        int j=i-1;
        int temp=arr[i];
        while(arr[j]>temp ){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={4,89,6,45,67,87,60};
        insertionSort(arr);
        Print(arr);
    }
}
