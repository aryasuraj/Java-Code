import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = s.nextInt();
        int n1=n;
        int count =0;
        while(n1>0){
            n1 = n1/10;
            count++;
        }
        // System.out.println(count);
        int sum=0;
        int n2 =n;
        while(n2>0){
            int rem=n2%10;
            sum = sum+ (int)Math.pow(rem, count);
            n2=n2/10;
        }
        if(n==sum){
            System.out.println("Number Is Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
        
        s.close();

    }
}
