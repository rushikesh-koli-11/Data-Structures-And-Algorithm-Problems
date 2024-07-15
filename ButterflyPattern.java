public class ButterflyPattern {
    public static void main(String[] args) {
        for(int row = 1;row<=4;row++){
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(4-row);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        for(int row = 4;row>=1;row--){
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            for(int space=1;space<=2*(4-row);space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
