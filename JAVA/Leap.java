import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        int year ;
        System.out.println("enter the Year");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        if(year%4==0){
            System.out.println("leap");
        }
        else{
            System.out.println("not");
        }
        s.close();
    }
}
