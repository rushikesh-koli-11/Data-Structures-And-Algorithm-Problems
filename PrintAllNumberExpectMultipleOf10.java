import java.util.*;
public class PrintAllNumberExpectMultipleOf10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int i = 1;i<=100;i++){
            System.out.println("Enter Number:");
            int n = sc.nextInt();

            if(n%10==0){
                System.out.println("Multiple Of 10");
                continue;
            }else{
                System.out.println(n);
            }

        }
    }
}
