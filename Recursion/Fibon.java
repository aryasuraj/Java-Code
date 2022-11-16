public class Fibon {
    public static int fibo(int n){
        if(n==1||n==2){
            return 1;
        }
        int n1=fibo(n-1);
        int n2=fibo(n-2);
        int out = n1+n2;
        return out;
        
    }
public static void main(String[] args) {
    int n=5;
    System.out.println(fibo(n));
}
}
