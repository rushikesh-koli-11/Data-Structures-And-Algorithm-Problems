public class SumOfNumInTwoRow {
    public static void TwoSum(int matrix[][]){
        int n = matrix.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = matrix[1][i] + sum;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int matrix[][] = { {1,4,9},{11,4,3},{2,2,3} };
        TwoSum(matrix);
    }
}
