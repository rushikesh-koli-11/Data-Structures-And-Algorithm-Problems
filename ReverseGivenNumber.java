public class ReverseGivenNumber {
    public static void main(String args[]){

        int n = 10899;

        int reverse = 0;
        for(int i = 1;i<=5;i++){
            int LastDigit = n%10;
            reverse = (reverse*10) + LastDigit;
            n = n/10;
            
        }
        System.out.println(reverse);
    }
}
