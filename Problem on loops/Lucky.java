import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        int rev=0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n=n/10;
        }
        int count =0;
        int n2=rev;
        int sumofsquredigit=0;
        while(n2!=0){
            n2=n2/10;
        if(count%2==0){
        sumofsquredigit = sumofsquredigit+(n2%10)*(n2%10);
        }
        count++;

        }
        // System.out.println(sumofsquredigit);
        if(sumofsquredigit%9==0){
            System.out.println("It is A Lucky Number");
        }
        else{
            System.out.println("No A Lucky Number");
        }
        s.close();
    }
}
