import java.util.List;

/*	Author	: Octavian Stoch
	Date	: 12/12/2019*/
public class all_paths_to_destination {
	/*	Given a directed, acyclic graph of N nodes.  
	 * 	Find all possible paths from node 0 to node N-1, 
	 * 	and return them in any order.

		The graph is given as follows:  the nodes are 0, 1, ..., 
		graph.length - 1.  graph[i] is a list of all nodes j 
		for which the edge (i, j) exists.

		Example:
		Input: [[1,2], [3], [3], []] 
		Output: [[0,1,3],[0,2,3]] 
		Explanation: The graph looks like this:
		0--->1
		|    |
		v    v
		2--->3
		There are two paths: 0 -> 1 -> 3 and 0 -> 2 -> 3.
	 */
	public static List<List<Integer>> solution(int [][] graph){
		return (myList(graph, 0));
	}
	
	public static List<List<Integer>> myList (int [][] graph, int node){
		
	}
	/*Let N be the number of nodes in the graph. If we are at node N-1, 
	 * the answer is just the path {N-1}. Otherwise, if we are at node node, 
	 * the answer is {node} + {path from nei to N-1} for each neighbor nei of node. 
	 * This is a natural setting to use a recursion to form the answer.*/
};
