
public class LogicalOperator {
    public static void main(String args[]){
        int a = 5;
        int b = 6;
        //and
        System.out.println(a==b && a<b);
        //or
        System.out.println(a==b || a<b);
        //not
        System.out.println(a!=b || !(a<b));
    }
}
