package searching;
import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search {
	public static int binary(int[] arr,int target) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(high+low)/2;
			if(arr[mid]==target) return mid;
			else if(arr[mid]<target) low=mid+1;
			else high=mid-1;
		}return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in); 
	    int n=sc.nextInt();
	    int a[]=new int [n];
	    for(int i=0;i<n;i++) {
	    	a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    int index=binary(a,3);
	    if(index!=-1){
	    	System.out.println("Element is found: "+ index);
	    }else{
	    	System.out.println("Element is not found");
	    }
		}

	}
