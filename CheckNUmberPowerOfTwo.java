public class CheckNUmberPowerOfTwo {
    public static void check(int n){
        int m = n-1;
        if((n & m) == 0){
            System.err.println("Power of 2");
        }
    }
    public static void main(String[] args) {
        int n = 48;
        check(n);
    }
}
