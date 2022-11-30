import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println( n+"*"+i +" multiply is "+n*i);
        }
        s.close();
    }
}