import java.util.*;
public class FunctionWithParameter {

    public static int SumOfaAndb(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println(SumOfaAndb(a,b));
    }
}
