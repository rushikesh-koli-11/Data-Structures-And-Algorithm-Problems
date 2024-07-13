import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int palidrome = sc.nextInt();

        if(isPalidrome(palidrome)){
            System.out.println("Palidrom");
        }else{
            System.out.println("not Palidrome");
        }
    }

    public static boolean isPalidrome(int number){
        int palidrome = number;
        int reverse = 0;

        while(palidrome != 0){
            int remindr =palidrome%10;
            reverse = reverse * 10 + remindr;
            palidrome = palidrome / 10;
        }

        if(number == reverse){
            return true;
        }
        return false;
    }
}
