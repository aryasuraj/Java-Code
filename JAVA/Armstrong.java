// import java.lang.FdLibm.Pow;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int n,a;
        int count=0;
        System.out.println("enter the number");
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        
        int n1 = n;
        while(n1!=0) {
            n1=n1/10;
            count++;
        }
        System.out.println(count);
        int  n2=n;
        int res=0;
        while(n2!=0){
             a =  n2%10;
            res = res+ (int)Math.pow(a,count);
            n2=n2/10;
        }
        if(n==res){
            System.out.println("arm");
        }
        else{
            System.out.println("not ");
        }
        s.close();
     
    }
}
