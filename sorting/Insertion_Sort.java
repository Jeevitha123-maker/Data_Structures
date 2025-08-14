package sorting;

public class Insertion_Sort {
public static void insertionsort(int a[]) {
	int current=0,j;
	for(int i=1;i<a.length;i++) {
		current=a[i];
		j=i-1;
		while(j>=0 && a[j]>current) {
			a[j+1]=a[j];
			j--;
		}a[j+1]=current;
	}
}
	public static void main(String[] args) {
		int a[]= {13,3,7,28,30,14,22,29,27};
		insertionsort(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
