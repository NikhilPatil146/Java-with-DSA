package patternQuestion;
import java.util.*;
public class pattern1 {

    public static void pattern1 (int n)
    {
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
    public static void main (String[] args)
    {
        int n=7;
        pattern1(n);
    }

}
