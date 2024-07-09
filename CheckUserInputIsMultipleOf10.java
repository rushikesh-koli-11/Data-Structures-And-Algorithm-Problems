import java.util.*;
public class CheckUserInputIsMultipleOf10 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<=100;i++){
            System.out.println("enter number:");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("You entered Multiple of 10");
                break;
            }
            System.out.println(n);
        }
    }
}