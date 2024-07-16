public class SelectionSort {

    public static void Selectionsort(int arr[]){
        for(int j=0;j<arr.length-1;j++){
            int small = j;
            for(int i = j+1;i<arr.length;i++){
                if(arr[i]<arr[small]){
                    small = i;
                }
            }
            int temp = arr[small];
            arr[small] = arr[j];
            arr[j] = temp;
        }
    }

    public static void printValue(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,4,8,6,7,2};
        Selectionsort(arr);
        printValue(arr);
    }
}
