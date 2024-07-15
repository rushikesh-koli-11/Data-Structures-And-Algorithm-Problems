import java.util.*;
public class Array {

    public static void main(String[] args) {

        //create
        int marks[]= new int[5];
        
        // int number[]={4,5,6};
        
        // String name[]={"hh","gg","ff"};

        //input
        Scanner sc = new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        //output
        System.out.println(marks[0]+ " " +  marks[1] + " " + marks[2]);
        
        //update
        marks[2] = 100;
        System.out.println(marks[0]+ " " +  marks[1] + " " + marks[2]);

        //array length
        System.out.println(marks.length);
    }
}