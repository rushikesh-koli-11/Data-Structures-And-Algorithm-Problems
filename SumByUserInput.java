import java.util.*;
public class SumByUserInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("sum of a and b is:");
        System.out.print(sum);


    }
}
