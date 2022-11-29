import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();  
        }
        //  int arr[0] = max;
        int max = arr[0];
         for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
         }
         System.out.println("largest element is"   + max);
         s.close();
    }
}
