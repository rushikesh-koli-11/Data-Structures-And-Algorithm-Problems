import java.util.*;
public class Print_1_to_n_whilw_loop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
