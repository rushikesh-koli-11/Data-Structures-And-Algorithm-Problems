public class PrintReverseOfaNumber {
    public static void main(String args[]){

        int n = 10899;

        for(int i = 1;i<=5;i++){
            int LastDigit = n%10;
            n=n/10;
            System.out.print(LastDigit);
        }
    }
}
