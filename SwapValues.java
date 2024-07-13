public class SwapValues {
    public static void main(String args[]){
        Swap(5, 4);
    }

    public static void Swap(int a, int b){
        int c =  a;
        a = b;
        b = c;
        System.out.println("now a is:" + a);
        System.out.println("now b is:" + b);

    }
}
