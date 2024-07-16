import java.util.*;
public class CountOfNumberOccureInTwoDArray {
    public static void count(int arr[][]){
        System.out.println("Enter number for count of occurence in 2D Array: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        
        int n = arr.length;
        int m = arr[0].length;

        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==key){
                    count++;
                }
            }
        }
        System.out.println("Count is: " + count);

    }
    public static void main(String[] args){
        int arr[][] = { {1,4,9},{11,4,3},{2,2,3} };
        count(arr);
    }
}
