public class FirstLetterToUppercase {
    public static String uppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
    }
    public static void main(String args[]) {
        String str = "hello world to me";
        System.out.println(uppercase(str));
    }
}
