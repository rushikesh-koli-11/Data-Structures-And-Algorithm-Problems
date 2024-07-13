import java.util.Scanner;

public class BinomialCoefficient {
    public static int fact(int n){
        int fact = 1;
        for(int i = 1;i<=n;i++){
            fact = fact*i;
        }
        return fact;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter r:");
        int r = sc.nextInt();
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n-r);
        int bino = nfact/(rfact*nrfact);
        System.out.println("Binomial Coefficient is:" + bino);
    }
}
