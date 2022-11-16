import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        int age ;
        System.out.println("enter the Age");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();
        if (age>=18){
            System.out.println("Applicable");
        }
        else{
            System.out.println("not");
        }
        s.close();
    }
}
