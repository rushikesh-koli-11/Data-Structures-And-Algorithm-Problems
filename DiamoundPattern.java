public class DiamoundPattern {

    public static void diamound(){
        for(int row=1;row<=4;row++){
            for(int space=4;space>=row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*row-1);star++){
                System.out.print("*");
            }
            // for(int star=1;star<=row;star++){
            //     System.out.print("*");
            // }
            // for(int star=5;star>=7-row;star--){
            //     System.out.print("*");
            // }
             System.out.println();
        }
        for(int row=4;row>=1;row--){
            for(int space=4;space>=row;space--){
                System.out.print(" ");
            }
            for(int star=1;star<=(2*row-1);star++){
                System.out.print("*");
            }
            // for(int star=1;star<=row;star++){
            //     System.out.print("*");
            // }
            // for(int star=5;star>=7-row;star--){
            //     System.out.print("*");
            // }
            
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamound();
    }
}
