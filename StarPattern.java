public class StarPattern {
    public static void main(String args[]){
        for(int outer = 1;outer<=4;outer++){
            for(int inner = 1;inner<=outer;inner++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
