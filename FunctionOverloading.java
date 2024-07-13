import java.util.Scanner;

public class FunctionOverloading {
    public static int multi(int a, int b){
        int multiply = a*b;
        return multiply;
    }
    public static int multi(int a, int b,int c){
        int multiply = a*b*c;
        return multiply;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Enter number c:");
        int c = sc.nextInt();
        
        System.out.println("Product of a and b is: " + multi(a,b));
        System.out.println("Product of a and b is: " + multi(a,b,c));

    }
}
