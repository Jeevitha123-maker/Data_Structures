package graph;
import java.util.Queue;
import java.util.LinkedList;
public class Undirected_graph {
	static int [][]matrix;
	static int vertices;
	public Undirected_graph (int vert) {
		vertices=vert;
		matrix=new int [vertices][vertices];
	}
	public static void print()
	{
		for(int i=0;i<vertices;i++) {
			for(int j=0;j<vertices;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void addEdge(int src,int des) {
		matrix[src][des]=1;
		matrix[des][src]=1;
	}
	public static void bfs(int start) {
		boolean[] visited=new boolean[vertices];
		Queue<Integer>data=new LinkedList<>();
		visited[start]=true;
		data.add(start);
		while(!data.isEmpty()) {
			int current=data.poll();
			System.out.print(current+" ");
			for(int i=0;i<vertices;i++) {
				if(matrix[current][i]==1 && !visited[i]) {
					visited[i]=true;
					data.add(i);
					
				}
			}
		}
	}
	public static void dfsUtil(int start,boolean visited[]) {
		visited[start]=true;
		System.out.print(start+" ");
		for(int i=0;i<vertices;i++) {
			if(matrix[start][i]==1&& !visited[i]) {
				dfsUtil(i,visited);
			}
		}
	}
	public static void dfs(int start) {
		boolean []visited=new boolean[vertices];
		dfsUtil(start,visited);
	}
	public static void main(String[] args) {
		Undirected_graph as =new Undirected_graph(5);
		addEdge(0,1);
		addEdge(0,2);
		addEdge(2,1);
		addEdge(2,3);
		addEdge(3,4);
		addEdge(4,1);
		print();
		System.out.println();
		bfs(0);
		System.out.println();
		dfs(0);
		
	}

}
