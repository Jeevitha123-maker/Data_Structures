package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector; 
public class Basics {

	public static void main(String[] args) {
		int a[]= {30,10,20,40,50,60,70};
		LinkedList<Integer> li=new LinkedList<>();
		if(a.length%2!=0) {
		for(int j=0;j<=a.length/2;j++) {
			li.add(a[j]);
			Collections.sort(li);
		}
		for(int i=a.length;i>a.length/2+1;i--) {
				li.add(a[i-1]);}
		System.out.print(li);
	}
	}

	}

