import java.util.*;
import java.lang.*;
import java.io.*;

public class length_of_longest_path {
	/*
	 	Author: Octavian Stoch
	 	Date: 12/5/2019
	Given a tree where each edge has a weight, 
	compute the length of the longest path in the tree.

	For example, given the following tree:

	   a
	  /|\
	 b c d
	    / \
	   e   f
	  / \
	 g   h

	and the weights: a-b: 3, a-c: 5, a-d: 8, 
	d-e: 2, d-f: 4, e-g: 1, e-h: 1, the longest 
	path would be c -> a -> d -> f, with a length of 17.

	The path does not have to pass through the root, 
	and each node can have any amount of children.
	
	
	SAMPLE CODE FOR MIN SPANNING TREE GREEDY ALG 
	(https://www.geeksforgeeks.org/
	kruskals-minimum-spa
	nning-tree-algorithm-greedy-algo-2/)
	
	also using adjacency list to help with creating the graph here
	(https://algorithms.tutorialhorizon.com/
	graph-representation-adjacency-matrix-and
	-adjacency-list/)
	*/
	
		static class Edge{ //class represent a graph edge
			int source, destination, weight;
			
			public Edge (int source, int destination, int weight) {
				this.source 		= source;
				this.destination	= destination;
				this.weight 		= weight;
			}
		};
		
		static class Graph {  //class to represent a graph
			int vertices;
			LinkedList<Edge> [] adjacencyList; //list of edges using adjecencylist (were gonna use DFS)
		
			Graph (int vertices){
				this.vertices = vertices;
				adjacencyList = new LinkedList[vertices];
				
				for (int i = 0; i < vertices ; ++i) {
					adjacencyList[i] = new LinkedList<>();
				}
			}
			
			public void addEdge(int source, int destination, int weight) {
				Edge edge = new Edge(source, destination, weight);
				adjacencyList[source].addFirst(edge);
				//undirected graph so don't need to have strict adding rules
			}
			
			public void printGraph() {
				for (int i = 0; i < vertices; i++) {
					LinkedList<Edge> list = adjacencyList[i];
					for (int j = 0; j < list.size(); j++) {
						System.out.println("VERTEX- "+i+" IS CONNECTED TO "+
								list.get(j).destination+" WITH WEIGHT "+
								list.get(j).weight);
					}
				}
			}
			
			public void totalWeight() { //find total weight of graph
				int res = 0;
				for (int i = 0; i < vertices; i++) {
					LinkedList<Edge> list = adjacencyList[i];
					for (int j = 0; j < list.size(); j++) {
						res+= list.get(j).weight;
					}
				}
				System.out.println("Total weight for graph is: " + res);
			}
			
			public void longestPath() {
				/*Approach
				 * 1) Initialize dist[] = {NINF, NINF, ….} 
				 * and dist[s] = 0 where s is the source vertex. Here NINF means negative infinite.
					2) Create a toplogical order of all vertices.
					3) Do following for every vertex u in topological order.				
					Do following for every adjacent vertex v of u
					if (dist[v] < dist[u] + weight(u, v))
					dist[v] = dist[u] + weight(u, v)
					adjacencyList is the list of vertices*/
				int finalWeight = 0;
				for (int i = 0; i < vertices; i++) {
					LinkedList<Edge> list = adjacencyList[i];
					for (int j = 0; j < list.size(); j++) {
						if (list.get(j).source < list.get(j).destination) {
							finalWeight += list.get(j).weight;
						}
					}
				}
				System.out.println("Longestpath: " + finalWeight);
			}
		}
	
	
	public static void main(String[] args) {  
		/*
		   	   a
			  /|\
			 b c d
			    / \
			   e   f
			  / \
			 g   h
		 */
		
		Graph graph = new Graph(8);
		
		/*	0 : A, 1 : B, 2 : C, 3 : D, 4 : E
		 *	5 : F, 6 : G, 7 : H  
		 *		weights: a-b: 3, a-c: 5, a-d: 8, 
				d-e: 2, d-f: 4, e-g: 1, e-h: 1
		 * Add edges below:
		 * add edge a-b*/
		
		graph.addEdge(0, 1, 3); //a-b: 3
		graph.addEdge(0, 2, 5); //a-c: 5
		graph.addEdge(0, 3, 8); //a-d: 8
		graph.addEdge(3, 4, 2); //d-e: 2
		graph.addEdge(3, 5, 4); //d-f: 4
		graph.addEdge(4, 6, 1); //e-g: 1
		graph.addEdge(4, 7, 1); //e-h: 1
		
		graph.printGraph();
		graph.totalWeight();
		graph.longestPath();
		
		/*
		TODO: continue creating the weighted graph and do logic for finding highest total weight
		using breadth first search
		*/
		
		
	}

}
