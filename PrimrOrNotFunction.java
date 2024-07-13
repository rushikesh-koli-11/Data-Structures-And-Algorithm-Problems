import java.util.Scanner;

public class PrimrOrNotFunction {

    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i = 2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=  false;
                break;
            }else{
                isPrime =  true;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int n = sc.nextInt();
    
        System.out.println(prime(n));
    }
}
