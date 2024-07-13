import java.util.Scanner;

public class FunctionOverloadingUsingParameterChange {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static int sum(int a, int b,int c){
        int sum = a+b+c;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Enter number c:");
        int c = sc.nextInt();
        
        System.out.println("Product of a and b is: " + sum(a,b));
        System.out.println("Product of a and b is: " + sum(a,b,c));

    }
}
