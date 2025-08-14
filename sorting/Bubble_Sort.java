package sorting;

public class Bubble_Sort {
public static void bubblesort(int arr[]) {
	boolean swapped=false;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				swapped=true;
			}
		}if(!swapped) break;
		
	}
	
}
	public static void main(String[] args) {
		int a[]= {5,24,4,27,12,23,10,15};
		bubblesort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
