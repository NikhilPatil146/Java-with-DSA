package BasicMaths;

public class PrintDivison {

    public static void PrintDivison(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        int n=35;
        PrintDivison(n);
    }
}
