public class Fact {
    public static int fact(int n) {
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
    //    int res= fact(n);
        // fact(n);
        // System.out.println(n);
    //    System.out.println(res);
        fact(n);
        System.out.println(fact(n));
    }
}
