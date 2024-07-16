public class MaxSubarraySumPrifix {
    public static void maxsubarrayssum(int arr[]){
        int currentSum=0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];

        prefix[0] = arr[0];
        //prefix calculte
        for(int i=0;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                currentSum = start == 0? prefix[end] : prefix[end] -prefix[start-1];
                

                if(maxSum<currentSum){
                    maxSum = currentSum;
                }
                 
            }
        }
        System.err.println("max sum: " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5};
        maxsubarrayssum(arr);
    }
}
