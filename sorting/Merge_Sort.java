package sorting;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
public class Merge_Sort {
	public static void mergesort(int a[],int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			mergesort(a,low,mid);
			mergesort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void merge(int a[],int low,int mid,int high) {
		
	}
	public static void main(String[] args) {
		int a[]= {15,89,20,25,12,6,24};
		mergesort(a,0,a.length-1);                                                                          
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
