package BasicMaths;

public class digit {
         public static void digit(int n)
         {
            int cut =0;
        while(n>0)
        {
           int lastdigit=n%10;
           cut=cut+1;
           n=n/10;
        
        }
        System.out.println(cut);
         }
    public static void main(String[] args) {
        int n=77;
        digit(n);
    }
}
