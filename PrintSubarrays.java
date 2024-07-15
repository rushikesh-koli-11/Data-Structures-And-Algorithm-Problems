public class PrintSubarrays {
    public static void subarrays(int arr[]){
        int TotalSubArray = 0;
        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print( arr[k] + "  ");
                }
                TotalSubArray++;
                System.err.println();
            }
            System.err.println();
        }
        System.err.println(TotalSubArray);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        subarrays(arr);
    }
}
