import java.util.*;

public class interweaving_stack_using_one_queue {

	/*	Author: Octavian Stoch
	 * 	Date:	12/26/2019
	 * 	Given a stack of N elements, interleave the first half 
	 * 	of the stack with the second half reversed using only 
	 *	one other queue. This should be done in-place.

		Recall that you can only push or pop from a stack, and 
		enqueue or dequeue from a queue.

		For example, if the stack is [1, 2, 3, 4, 5], 
		it should become [1, 5, 2, 4, 3]. 
		If the stack is [1, 2, 3, 4], 
		it should become [1, 4, 2, 3].

		Hint: Try working backwards from the end state.*/
	
	private static void solution() {
		Random randomNumbers = new Random();				//make new Random object
		int size = randomNumbers.nextInt(15);				//random integer between 0-50
		Stack<Integer> numberStack = new Stack<Integer>();	//name new integer stack object
		
		while (numberStack.size() <= size) {				//while size of of stack isn't size
			numberStack.add(randomNumbers.nextInt(10));		//add a random integer 0-10
		}
		
		System.out.println("Size of stack = "+numberStack.size()+"\nStack = "+numberStack);
															//print out the stack + size of stack
		splitStackIntoTwo(numberStack);
	}
	
	private static Queue<Integer> splitStackIntoTwo(Stack<Integer> st) {
		Queue<Integer> numberQueue = new LinkedList<Integer>();
		Stack<Integer> numberStack = new Stack<Integer>();
		//numberStack.addAll(st);
															//make a new queue object of type LinkedList
		int middleOfStack	= st.size()/2;					//middle of the stack is size divide by 2
		int starfish		= 0;
		
		for (int i = middleOfStack; i < st.size(); i++) {
			numberQueue.add(st.get(i));						//add each integer of the stack starting at the middle
			numberStack.add(st.get(starfish));
			starfish += 1;
		}
	
		System.out.println("\nNew queue = "+numberQueue+"\nnumberStack = "+numberStack);
		reverseQueue(numberQueue);
		
		return numberQueue;
	}
	
	private static Stack<Integer> reverseQueue(Queue<Integer> qu){
	     Stack<Integer> numStack	= new Stack<>();
	     Queue<Integer>	newQueue	= new LinkedList<Integer>();
	     while (!qu.isEmpty()) { 
	    	 numStack.add(qu.peek()); 
	    	 qu.remove(); 
	     } 
	     
	     while (!numStack.isEmpty()) { 
	    	 newQueue.add(numStack.peek()); 
	    	 numStack.pop(); 
	     }
	      
	     
		System.out.println("\nreversedQueue<Stack> = "+newQueue);
		
		return numStack;
	}
	
	//private static Stack<Integer> interweave()
	/* while (stack && queue !.isEmpty() {
	 * 		finalStack.add(stack.get(i))
	 * 		stack.remove(stack.get(i)
	 * 		finalStack.add(queue.peek())
	 * 		queue.remove()
	 * }
	 * print the resulting stack*/

	public static void main(String[] args) {
		solution();
	};
}
