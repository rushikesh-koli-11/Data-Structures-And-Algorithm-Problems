public class SmallestNumberInArray {
    public static int smallestnumber(int arr[]){
        int max = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {9,54,3,1,8,6,4,7,5,9,2,6,7};
        System.out.println(smallestnumber(arr));
    }
}
