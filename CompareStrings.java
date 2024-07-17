public class CompareStrings {
    public static void main(String[] args) {
        String str1 = new String("abcd");
        String str3 = "abcd";
        
        //comparing above str1 and str3 by using == willgive notequal 
        //so we use equals operation as following

        if(str1.equals(str3)){
            System.out.println("Equals");
        }else{
            System.out.println("Not equal");
        }
    }
}
