import java.util.*;
public class InbuidSort {
    public static void prinarr(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={2,5,3,8,4,2,6,8,3,7,4,6,7,9};
        // Arrays.sort(arr);
        //Arrays.sort(arr,3,9);
        Arrays.sort(arr,Collections.reverseOrder());
        //Arrays.sort(arr,3,9,Collections.reverseOrder());
        prinarr(arr);

    }
}
