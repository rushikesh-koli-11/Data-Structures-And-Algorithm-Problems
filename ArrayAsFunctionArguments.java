public class ArrayAsFunctionArguments {
    public static void update(int marks[]){
        //original array print
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]);
            System.out.print(" ");
        }

        //updating array in function
        for(int i=0;i<marks.length;i++){
            marks[i]++;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int marks[] = {98,94,91};
        update(marks);

        //print updated array from function
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]);
            System.out.print(" ");

        }
        
    }
}
