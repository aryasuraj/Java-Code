import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a,b,c,i,n;
        System.out.println("enter");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        a=0;
        b=1;
        System.out.println(a);
        for(i=0;i<=n;i++){
        // System.out.println(a);
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
        }
               sc.close();
    }
}
