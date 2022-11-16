public class Digitcount {
    public static int count(int n) {
        if(n==0){
            return 0;
        }
        else{
            return 1+count(n/10);
        }
    }
    public static void main(String[] args) {
        int n =126689;
        System.out.println(count(n));
        
    }
}
