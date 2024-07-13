import java.util.Scanner;

public class PrimeInRange {
    public static int range(int n){
        for(int i=1;i<=n;i++){
            for(int j = 2;i<=j;j++){
                if(j%i==0){
                    continue;
                }else{
                    System.out.println(i);
                }
            }
            
        }
        
        return 0;
    }

    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(range(n));
    }
}
