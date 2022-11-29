import java.util.Scanner;

public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        int arr []= new int[5];
      
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();  
        }
        System.out.println("enter the num");
        int x = sc.nextInt();
        int ans =-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans = i;
                break;
            } 
          
        
        }
        if(ans==-1){
            System.out.println("not found");
        }
        System.out.println("index is "  +  ans);
      
      
        sc.close();


    }
}
