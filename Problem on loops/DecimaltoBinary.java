import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        String b="";
        while(n>0){
            int rem = n%2;
            b=rem+b;
            n=n/2;
            
        }
        System.out.println(b);
        s.close();
    }
}
