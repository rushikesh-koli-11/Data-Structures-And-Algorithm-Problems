public class FloydsTriangle {
    public static void main(String[] args) {
        int counter = 1;
        for(int row=1;row<=5;row++){
            for(int col=1;col<=row;col++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
}
