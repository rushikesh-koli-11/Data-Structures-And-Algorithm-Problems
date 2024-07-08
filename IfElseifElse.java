import java.util.*;
public class IfElseifElse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age<13){
            System.out.println("less than 13");
        }else if(age<=17 && age>=13){
            System.out.println("betweeen 13-17");
        }else{
            System.out.println("18+");
        }
    }
}