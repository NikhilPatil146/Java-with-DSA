package BasicMaths;

public class palindromeNumber {
    public static void palindromeNumber(int n)
    {
   int dup =n;
   int Reverse=0;
   
      while(n>0)
      {
        int lastdigit=n%10;
        Reverse=(Reverse*10)+lastdigit;
        n=n/10;
      }
      if(Reverse==dup)
      {
        System.out.println("True");
      }
      else{
        System.out.println("faluse");
      }
   
}
public static void main(String[] args) {
   int n=1221;
  palindromeNumber(n);
}
}
