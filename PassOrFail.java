import java.util.*;

public class PassOrFail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        String report = (marks>=33)?"pass":"fail";
        System.out.println(report);
        // if(marks>=33){
        //     System.out.println("pass");
        // }else{
        //     System.out.println("fail");
        // }

    }
}
