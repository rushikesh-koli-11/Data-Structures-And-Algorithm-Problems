public class MazSubarraySum {
    public static void maxsubarrayssum(int arr[]){
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currentSum = 0;
                for(int k=start;k<=end;k++){
                   currentSum += arr[k];
                }
                System.out.println(currentSum);
                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
                 
            }
        }
        System.err.println("max sum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        maxsubarrayssum(arr);
    }
}
