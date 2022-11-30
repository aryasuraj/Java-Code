import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=s.nextInt();
        int rev =0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        if(n==rev){
            System.out.println("Yes Num Is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        s.close();

        
    
        
    }
}
