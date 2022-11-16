import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int n = s.nextInt();
        int i,j,count=0;
        for(i=1;i<=n;i++){
            count=0;
            for(j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
            }
        }
    }
}
