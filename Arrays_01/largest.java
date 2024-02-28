 package Arrays_01;

import java.util.*;
public class largest {
    public static void largest(int arr[], int n) {
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }
        System.out.println(largest);
    }

 public static void main(String[] args) {
  
       int a[]={13,46,24,87,20};
       int n=a.length;
   
       largest(a,n);
 }
}
  

