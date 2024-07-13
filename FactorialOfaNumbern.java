import java.util.Scanner;

public class FactorialOfaNumbern {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = i*fact;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factorial number:");
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
