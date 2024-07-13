import java.util.*;
public class ProdctOfaAndb {

    public static int product(int a, int b){
        int Product = a*b;
        return Product;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println(product(a, b));
    }
}
