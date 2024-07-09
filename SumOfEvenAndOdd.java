public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        int EvenSum = 0;
        int OddSum = 0;
        int n = 10;
        for(int i = 1;i<=n;i++){
            if (i%2==0) {
                System.out.println(i + " is Even");
                EvenSum = EvenSum + i;
            }else{
                System.out.println(i + " is Odd");

                OddSum = OddSum + i;
            }
        }
        System.out.println("Even Sum is :" + EvenSum);
        System.out.println("Odd Sum is :" + OddSum);
    }
}
