public class ReverseArray {
    public static void swap(int arr[]){
        int first =0;
        int last = arr.length-1;

        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,8,9};
        swap(arr);
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
