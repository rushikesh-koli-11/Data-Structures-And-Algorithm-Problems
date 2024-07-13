public class BinarytoDecimal {
    public static void BinaryDecimal(int n){
        int mynub = n;
        int pow = 0;
        int dec = 0;

        while(n>0){
            int lastdigit = n%10;
            dec = dec + (lastdigit * (int)Math.pow(2,pow));
            pow++;
            n = n/10;
            
        }
        System.out.println("decimal of " + mynub + "is" + dec);
    }
    public static void main(String[] args) {
        BinaryDecimal(101);
        
    }
}
