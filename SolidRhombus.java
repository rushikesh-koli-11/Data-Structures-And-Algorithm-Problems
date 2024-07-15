public class SolidRhombus {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int space=1;space<=5-row;space++){
                System.out.print("$");
            }
            for(int star=1;star<=5;star++){
                System.out.print("*");
            }
            for(int space=1;space<=row-1;space++){
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
