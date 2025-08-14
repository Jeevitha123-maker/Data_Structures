package coins;
import java.util.Arrays;
import java.util.Scanner;

public class CoinWithMemorization {
	public static int minCoin(int n,int []a,int []dp) {
		if(n==0) return 0;
		int res=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=n) {
				int subRes=minCoin(n-a[i],a,dp);
				if(subRes!=Integer.MAX_VALUE) {
					res=Math.min(res, subRes+1);
				}
			}
		}return res;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int dp[]=new int[n+1];
		Arrays.fill(dp,-1);
		int a[]= {9,6,5,1};
		System.out.print(minCoin(n,a,dp));

	}

}
