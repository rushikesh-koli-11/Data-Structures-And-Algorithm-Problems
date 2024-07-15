public class HollowRhombus {
    public static void main(String[] args) {
        for(int row=1;row<=5;row++){
            for(int space=1;space<=5-row;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=5;star++){
                if(row==1 || row==5 || star==1 || star==5){

                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
