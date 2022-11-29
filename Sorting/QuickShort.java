public class QuickShort {
    public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
          if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
          }
        }
        i++;
        int temp =arr[i];
        arr[i]=pivot;//arr[high];
        arr[high]=temp;
        return i;
    }
    public static void quickShorter(int arr[],int low,int high) {
        if(low<high){
            int pividx=partition( arr, low , high);
            quickShorter(arr, low, pividx-1);
            quickShorter(arr, pividx+1, high);

        }
    }
    public static void main(String[] args) {
        int arr[]={12,34,3,7,9};
        int  n= arr.length;
        quickShorter(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
