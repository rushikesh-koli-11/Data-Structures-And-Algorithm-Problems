import java.util.*;
public class PrimeNUmber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean check = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                check = false;
            }
        }

        if(check==true){
            System.out.println("Prime");
        }else if (check==false){
            System.out.println("Not Prime");
        }
    }
}
