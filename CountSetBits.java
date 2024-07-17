public class CountSetBits {
    public static void count(int n){
        int count = 0;
        int bitmap = 1;
        while(n>0){
            if((n & bitmap) != 0){
                count++;
            }
            n= n >> 1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 15;
        count(n);
    }
}
