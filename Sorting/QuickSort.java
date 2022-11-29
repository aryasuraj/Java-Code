public class QuickSort {
    public static int partition(int arr[],int low,int high) {
        int pivot = arr[high];
        int i =low-1;//pivot se chote element
        for(int j=low;j<high;j++){
           if(arr[j]<pivot){
            i++;
            //swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
           }
        }
        i++;
        int temp =arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i;
    }
    public static void quickSort(int arr[],int low ,int high) {
        if(low<high){
            int pivotidx = partition(arr,low,high);
            quickSort(arr,low,pivotidx-1);
            quickSort(arr, pivotidx+1, high);
        }
    }

    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        int n= arr.length;
        quickSort(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
