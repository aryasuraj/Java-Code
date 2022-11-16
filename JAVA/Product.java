import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        int cp,sp;
        System.out.println("enter cp");
        System.out.println("enter sp");
        Scanner s = new Scanner(System.in);
        cp= s.nextInt();
        sp=s.nextInt();
        if((sp-cp)>0){
            System.out.println("profit");
        }
        else{
            System.out.println("loss");
        }
        s.close();
    }
}
