import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr []=new int[5];
        int n = arr.length;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n/2;i++){
           int temp = arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=temp;
        }
        for(int i=0;i<n;i++){
            // System.out.println("he");
            System.out.print(arr[i]+" ");
        }
        s.close();
    }
}
