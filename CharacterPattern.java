public class CharacterPattern {
    public static void main(String args[]){
        char ch = 'A';
        for(int outer = 1; outer<=4;outer++){
            for(int inner = 1;inner<=outer;inner++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
