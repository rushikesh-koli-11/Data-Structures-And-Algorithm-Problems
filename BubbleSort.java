public class BubbleSort {
    public static void sort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j = 0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
    }
    public static void Printarr(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {5,4,2,3,1};
        sort(arr);
        Printarr(arr);
    }
}
