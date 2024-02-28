package Arrays_01;

public class secondlargest {
    
    public static int secondlargest(int arr[], int n) {
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] > slargest && arr[i] != largest) {
                slargest = arr[i];
            }
        }
        return slargest;
    }

    public static int secondsmallest(int arr[], int n) {
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                ssmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < ssmallest && arr[i] != smallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int slargest = secondlargest(a, n);
        int ssmallest = secondsmallest(a, n);
        int[] result = {slargest, ssmallest};
        return result;
    }
    public static void main(String[] args) {
  
        int a[]={13,46,24,87,20};
        int n=a.length;
        getSecondOrderElements(n, a);

    
}
}
