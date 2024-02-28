package Arrays_01;

public class removeduplicate{
    public static int duplicates(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
       return i+1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        int j = duplicates(arr);
        System.out.println("after removing duplicates ");
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i] + "");
        }
    }
}