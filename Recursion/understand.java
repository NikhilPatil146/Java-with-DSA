package Recursion;

public class understand {
     static  int cnt = 0;
    public static void print(){
        
        
         if(cnt == 3 ) return;
         System.out.println(cnt);


         cnt = cnt+1;
         print();

    }
    public static void main(String[] args) {
        print();
    }
}