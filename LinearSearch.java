public class LinearSearch {

    public static int linearsearch(int marks[],int key){
        for(int i = 0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int marks[]={2,4,6,8,10};
        int key = 8;
        System.out.println(linearsearch(marks, key));
        
    }
}
