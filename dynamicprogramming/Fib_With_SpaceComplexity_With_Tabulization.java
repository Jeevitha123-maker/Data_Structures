package dynamicprogramming;
import java.util.*;
public class Fib_With_SpaceComplexity_With_Tabulization {
    public static int fib(int n) {
        int t1=0,t2=1;
        for(int i=2;i<=n;i++) {
            int t3=t1+t2;
            t1=t2;
            t2=t3;
        }
        return t2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));

    }

}
