public class StockMaxProfit {
    public static void maxProft(int arr[]){
        int start = 0;
        int profit = 0;
        int arrUpdated[] = new int[10];
        for(int i=0;i<arr.length;i++){
            start = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(start<arr[j]){
                    profit = arr[j]-arr[i];
                    arrUpdated[i] = profit;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arrUpdated.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        maxProft(arr);
    }
}
