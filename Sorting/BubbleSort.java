class BubbleSort{
    public static void PrintArray(int arr[]) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void bubbleSort(int arr[]) {
        int n =  arr.length;
        int i;
        for(i=0;i<n-1;i++){
        int j ;
        for(j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
        }
    }
    public static void main(String[] args) {
        int arr[]={12,45,10,44,4,6,12,0};
        bubbleSort(arr);
        PrintArray(arr);
    }
}