package dynamicprogramming;

import java.util.Scanner;
public class FibWithTabulization {
	public static int fib(int n) {
		if(n<=1) return n;
		int dp[]=new int[n+1];
		dp[0]=0;dp[1]=1;
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-2]+dp[i-1];
		}
		return dp[n];
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}

}
