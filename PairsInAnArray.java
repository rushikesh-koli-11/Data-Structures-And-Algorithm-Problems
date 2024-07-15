
public class PairsInAnArray {
    public static void pair(int arr[]){
        for(int i=0;i<arr.length;i++){
            int currentNUmber = arr[i];

            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" + currentNUmber + "," + arr[j] + ")");
            }
            //currentNUmber++;
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8};
        pair(arr);
    }
    
}