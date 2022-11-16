public class Print {
    public static void sol(int n) {
        if(n==6){
            return;
        }
        System.out.println(n);
        sol(n+1);
        
    }
    public static void main(String[] args) {
        int n=1;
        sol(n);
    }
}
