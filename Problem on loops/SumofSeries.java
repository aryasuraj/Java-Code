import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        double n = s.nextInt();
        double sumofSeries=0;

        for(double i=1; i<=n;i++){
        sumofSeries =sumofSeries+(1)/(i);
        }
        System.out.println(sumofSeries);
        s.close();
    }
}
