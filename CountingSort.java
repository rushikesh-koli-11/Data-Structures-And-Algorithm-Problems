public class CountingSort {
    public static void countSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[i] =i;
                i++;
                count[i]--;
            }
        }
    }
    public static void Printarr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,7,6,4,2,1,3};
        countSort(arr);
        Printarr(arr);
    }
}
