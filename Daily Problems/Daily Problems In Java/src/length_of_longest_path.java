import java.util.*;
import java.lang.*;
import java.io.*;

public class length_of_longest_path {
	/*
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
	*/
	
		class Edge implements Comparable<Edge>{ //represent a graph edge
			int source, destination, weight;
			
			public int compareTo(Edge compareEdge) {//compare edges based on weight
				return this.weight-compareEdge.weight;
			}
		};
		
		class subset { //represent a subset for a union-find
			int parent, rank;
		};
		
		int V, E; //V = number of vertices . E = number of edges
		Edge edge[]; //array of edges
		
		length_of_longest_path(int v, int e){ //create a graph with number of v and e
			V = v;
			E = e;
			edge = new Edge[E];
			for (int i = 0; i < e; i++) {
				edge[i] = new Edge();
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
		
		int V = 8; //number of vertices in the graph
		int E = 6; //number of edges in the graph
		length_of_longest_path graph = new length_of_longest_path(V, E);
		
		/*	0 : A, 1 : B, 2 : C, 3 : D, 4 : E
		 *	5 : F, 6 : G, 7 : H  
		 *		weights: a-b: 3, a-c: 5, a-d: 8, 
				d-e: 2, d-f: 4, e-g: 1, e-h: 1
		 * Add edges below:
		 * add edge a-b*/
		
		graph.edge[0].source 		= 0;
		graph.edge[0].destination	= 1;
		graph.edge[0].weight		= 3;
		
		//TODO: continue creating the weighted graph
		
		
	}

}
