import java.util.Scanner;

public class SumOddEvenPlace {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        int rev =0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp=temp/10;
        }
        // System.out.println(rev);
        int n2=rev;
        int soe=0;
        int soo=0;
        int count=0;
        while(n2!=0){
            n2=n2/10;
            if(count%2==0){
                soe =soe+(n2%10);
            }
            else{
            soo = soo+(n2%10);
            }
            count++;
        }
        System.out.println("sum of even"+soe+"   "+"sum of odd"+soo);
        s.close();
    }
}
