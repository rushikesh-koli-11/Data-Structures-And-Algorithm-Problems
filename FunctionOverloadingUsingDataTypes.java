import java.util.Scanner;

public class FunctionOverloadingUsingDataTypes {
    public static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static float sum(float a, float b){
        float sum = a+b;
        return sum;
    }
    
    public static void main(String args[]){
        // Scanner sc =new Scanner(System.in);
        // System.out.println("Enter number a:");
        // float a = sc.nextFloat();
        // System.out.println("Enter number b:");
        // float b = sc.nextFloat();
        
        System.out.println("Product of a and b is: " + sum(4,5));
        System.out.println("Product of a and b is: " + sum(4.5f,4.5f));

    }
}
