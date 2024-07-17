import java.util.*;
public class EvenOddCheckBitManipulation {
    public static void check(int n){
        int checkbit = 1;
        if((n & checkbit) == 0){
            System.out.println("Even");
        }else{
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n);
    }
}
