package BasicMaths;

public class ReverseNumber {
    public static void ReverseNumber(int n)
    {
      int Reverse=0;
   while(n>0)
   {
      int lastdigit=n%10;
      Reverse= (Reverse *10)+lastdigit;
      n=n/10;
   
   }
   System.out.println(Reverse);
    }
public static void main(String[] args) {
   int n=7789;
  ReverseNumber(n);
}
}
