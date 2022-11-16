import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        System.out.println("1.drinks");
        System.out.println("2.sweet");
        System.out.println("3.tea");
        System.out.println("choice");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if(choice==1){
            System.out.println("drink");
        }
        else if (choice==2){
            System.out.println("Sweet");
        }
        else{
            System.out.println("tea");
        }
        s.close();
    }
}
