import java.util.Scanner;

public class Seed {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Seed Number");
        int  X =s.nextInt();
        System.out.println("Enter Number");
        int Y = s.nextInt();
        int seed=1;
        int n2=X;
        while(n2!=0){
            int digit= n2%10;
            seed = seed*digit;
            n2=n2/10;
        }
        int orginalseed=(X*seed);
        // System.out.println(orginalseed);
        if(orginalseed==Y){
        System.out.println("Yes : X is Seed Of Y");
        }
        else{
            System.out.println("Not : X not seed of Y");
        }
        s.close();
    }
}
