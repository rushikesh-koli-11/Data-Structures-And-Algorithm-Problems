public class LargestNumberInArray {
    public static int largestNUmber(int arr[]){
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,5,3,7,8,9,5,4,};
        System.out.println(largestNUmber(arr));
    }
}
