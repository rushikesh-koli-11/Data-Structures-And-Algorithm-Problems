import java.util.*;
public class StringBasic {
    public static void strPrint(String str3){
        for(int i=0;i<str3.length();i++){
            System.out.println("your name contain following letter at index " + i + " is " +str3.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = " my name is siri";
        //String str2 = new String("abcd");

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String str3 = sc.nextLine();
        System.out.println("Hi " + str3+", ");

        //length of String
        System.out.println("String length is: "+ str3.length());

        //concatination
        String sentence =str3+"," + str;
        System.out.println("hello " + sentence);

        //charAt
        //calling functtion for each letter in str
        strPrint(str3);
    }
}
