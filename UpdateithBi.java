public class UpdateithBi {


    public static int clearbit(int n,int i){
        int bitmask = ~(1<<i);
        return (n & bitmask);
    }

    public static int setbit(int n,int i){
        int bitmask = 1<<i;
        return (n | bitmask);
    }

    public static int updatebit(int n,int i,int newbit){
        if(newbit==0){
            return clearbit(n, newbit);
        }else{
            return setbit(n, newbit);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int z = 1;
        System.out.println(updatebit(n, i,z));
    }
}
