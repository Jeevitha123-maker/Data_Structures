package graph;
import java.util.*;
public class GraphList_Implementation {
	static List<List<Integer>>al=new ArrayList<>();
	public GraphList_Implementation(int vertices) {
		for(int i=0;i<vertices;i++) {
			al.add(new ArrayList<Integer>());
		}
	}
	public static void insert(int src,int des) {
		al.get(src).add(des);
		al.get(des).add(src);
	}
	public static void display() {
		int k=0;
		for(List<Integer>i:al) {
			System.out.println(k++ +"---->"+i);
		}
	}
	public static void main(String[] args) {
		GraphList_Implementation as=new GraphList_Implementation(5);
		insert(0,1);
		insert(0,2);
		insert(2,1);
		insert(2,3);
		insert(3,4);
		insert(4,1);
		display();
	}

}
