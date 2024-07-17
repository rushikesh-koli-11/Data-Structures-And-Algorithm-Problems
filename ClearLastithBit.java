public class ClearLastithBit {
    public static int update(int n,int i){
        int bitmap= (~0)<<i;
        return n & bitmap;
    }
    public static void main(String args[]){
        int n = 15;
        int i = 2;
        System.out.println(update(n,i));
    }
}