package Sorting;
public class selection{
 
public static void selection_sort(int arr[],int n)
{
    
    for(int i=0;i<n-1;i++)
    {
    int minIndex=i;
    for(int j=i+1;j<n;j++)
    {
    if(arr[j]<arr[minIndex])
       minIndex=j;    
    }
     int temp=arr[minIndex];
     arr[minIndex]=arr[i];
     arr[i]=temp;
    }
    System.out.println("After selection sort:");
    for( int i=0;i<n;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

      
}

    public static void main(String[] args) {
        int arr[]={12,46,23,8,67};
        int n=arr.length;
        System.out.println("Before selection sort:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selection_sort(arr,n);
        
    }
}