import java.util.*;
public class LargestOfThreeNumbers {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Enter number c:");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println("a is grater");
            }else{
                System.out.println("c is greater");
            }
            
        }else if(b>a){
            if(b>c){
                System.out.println("b is geater");
            }else{
                System.out.println("c is grater");
            }
        }
    }
}
