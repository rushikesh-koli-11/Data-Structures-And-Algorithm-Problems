public class BInarySearch {
    public static int binary(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            //compare
            if(numbers[mid] == key){
                return mid;
            }else if(numbers[mid]<key){
                start = mid+1;
            }else if(numbers[mid]>key){
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int key = 7;
        System.out.println( "at index: " + binary(arr,key));
    }
}
