package graph;

import java.util.LinkedList;

public class Dijkstra {
	private int V;
	private LinkedList<Integer> adj[];
	private int[] sptSet;
	private int[] parent;
	
	public Dijkstra(int V) {
		// TODO Auto-generated constructor stub
		this.V = V;
		adj = new LinkedList[V];
		for(int i=0;i<V;i++)
		{
			adj[i] = new LinkedList<>();
		}
		sptSet = new int[V];
		parent = new int[V];
	}
	void addEdge(int u,int v)
	{
		adj[u].add(v);
	}
	void initialise(int start)
	{
		
	}
	void checkDijkstra(int start)
	{
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] a = new boolean[5][24];
		System.out.println(a[1][4]);

	}

}
