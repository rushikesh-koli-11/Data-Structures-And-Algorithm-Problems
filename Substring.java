public class Substring {
    public static String sub(String str,int si,int ei){
        String substr = "";
        for(int i = si;i<ei;i++){
            substr =substr + str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        int si =0;
        int ei = 4;
        System.out.println(sub(str, si, ei));

        //shortcut
        System.out.println(str.substring(si,ei));

    }
}
