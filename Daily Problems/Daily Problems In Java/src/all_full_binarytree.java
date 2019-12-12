import java.util.ArrayList;
import java.util.List;

public class all_full_binarytree {
	/*return the total number of FULL binary trees of size N
	 * this was the third question at the 12/10/2019 tech interviews meetup
	 * x + y = n - 1
	 * x, y = odd
	 * solution(1) = [Node()]
	 * Author:	Octavian Stoch
	 * Date:	12/11/2019*/
	
	static class Node{	//class represent a node in a tree
		int val;
		Node left;
		Node right;
		Node (int i) {
			val = i;
		}
	}

		private static List<Node> solution(int n) { //list of nodes to return
			List<Node> answer = new ArrayList<>();//create an empty ArrayList of nodes
			
			if (n % 2 != 0) { //base case
				answer.add(new Node(0));
			}
			for (int x = 1; x < n; x += 2) { //increment by 2 because you can't have one node without two children
				int y = n - x - 1;			//recursion steps below
				
				for (Node left  : solution(x)) {
					
					for (Node right : solution(y)) {
						Node node = new Node(0);
						node.left = left;
						node.right = right;
						answer.add(node);
					}
				}
			}
			toPrint(answer);
			return answer;
		}
		
		private static void toPrint(List<Node> myList) { //printing a list of nodes helper function
			for (int i = 0; i < myList.size(); ++i) {
				System.out.println(myList.get(i).toString());
			}
		}
		
	public static void main(String[] args) {
		solution(8);

	}

}
