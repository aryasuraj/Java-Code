public class Occurence {
    public static void occurence(int arr[]) {
        int n= arr.length;
        int x=70;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={1,5,5,7,5,5,5,5,56,5,7,5,5,8,9};
        // int n = arr.length;
        occurence(arr);
    }
}
