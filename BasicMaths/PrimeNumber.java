package BasicMaths;

public class PrimeNumber {
    public static void PrimeNumber(int n)
    {
        // int count=0;
        // for(int i=1;i<=n;i++)
        // {
        //     if(n%i==0)
        //         count++;
        // }
        // if(count==2)
        // {
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("false");
        // }
          int count=0;
        for(int i=0;i*i<=n;i++)
        {
         if(n%i==0)
         {
           count++;
         }
         if((n%i)!=i)
         {
            count++;
         }

        }
if( count==2)
{
    System.out.println("True");
}
else
{
    System.out.println("false");
}
    }

    public static void main(String[] args) {
        int n=37;
        PrimeNumber(n);
    }
}
