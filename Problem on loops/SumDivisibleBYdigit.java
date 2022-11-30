import java.util.Scanner;

public class SumDivisibleBYdigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        int sum=0;
        int n1=n;
        while(n1>0){
            int digit = n1%10;
            sum = sum +digit;
            n1 =n1/10;
        }
        // System.out.println(sum);
        if(n%sum==0){
          System.out.println("Is Divisible");
        }
        else{
            System.out.println("Not Divisible");
        }


        s.close();
    }
}
