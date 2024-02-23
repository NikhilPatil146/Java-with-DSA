package BasicMaths;

public class ArmstrongNumber {
    public static void ArmstrongNumber(int n)
    {
        int dup=n;
        int sum =0;
        while(n>0)
        {
            int lastdigit=n%10;
            sum=sum+(lastdigit*lastdigit*lastdigit);
            n=n/10;        
        }
        if(sum==dup)
        {
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }   
     }

    public static void main(String[] args) {
        int n=371;
        ArmstrongNumber(n);
    }
}
