import java.util.*;
public class IfElseAge {
    public static void main(String args[]){
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //int age = 22;
        if(age>=18){
            System.out.println("can Drive car");
        }else{
            System.out.println("can not drive car");
        }
    }
}