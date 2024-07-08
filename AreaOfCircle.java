import java.util.*;
public class AreaOfCircle{
    public static void main(String args[]){
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of circle:");
        int R = sc.nextInt();
        double area = pi*R*R;
        System.out.println("area of circle is:");
        System.out.println(area);

    }
}