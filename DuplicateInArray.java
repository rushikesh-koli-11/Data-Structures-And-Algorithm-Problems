public class DuplicateInArray {
    public static boolean duplicate(int arr[]){
        boolean check = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    check = true;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int arr[]={2,1,10,3,5,6,7};
        System.out.println(duplicate(arr));
    }
}
