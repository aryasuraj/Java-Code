public class MergeShort {
    public static void Conquer(int arr[],int si,int ei,int mid) {
        int merged []=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
             merged[x]=arr[idx1];
             x++;
             idx1++;
            }
            else{
                merged[x]=arr[idx2];
                x++;
                idx2++;
            }
        }
        while(idx1<=mid){
            merged[x]=arr[idx1];
            x++;
            idx1++;
        }
        while(idx2<=ei){
            merged[x]=arr[idx2];
            x++;
            idx2++;
        }
        for(int i=0, j=si;i<merged.length;i++,j++){
           arr[j]=merged[i];
        }

    }
    public static void Devide(int arr[],int si,int ei) {
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        Devide(arr, si, mid);
        Devide(arr, mid+1, ei);
        Conquer(arr, si,ei,mid);
    }
    public static void main(String[] args) {
        int arr []={6,3,9,5,2,8};
        int n= arr.length;
        Devide(arr,0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
}
