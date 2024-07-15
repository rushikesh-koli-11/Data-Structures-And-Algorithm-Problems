public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        for(int row =1;row<=4;row++){
            for(int space=1;space<=4-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=row;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
