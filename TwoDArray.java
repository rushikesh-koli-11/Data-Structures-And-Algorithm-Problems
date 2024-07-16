import java.util.*;
public class TwoDArray {
    public static void search(int matrix[][],int n,int m,int key){
        
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("Search key found at: " + i +","+ j);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int matrix[][] =new int[3][3];
        int n = matrix.length,m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.println("enter number for " + i + "," + j + ": ");
                matrix[i][j] = sc.nextInt();
            }

        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("Enter search key: ");
        int key = sc.nextInt();
        search(matrix, n, m,key);
    }
}
