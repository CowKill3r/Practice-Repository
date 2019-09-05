import java.util.*;

class SimpleAutocomplete {

	//['dog', 'deerdo', 'deal', 'delve', 'dido', 'don']

	public static void main (String[] args){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("dog");
		myList.add("deerdo");
		myList.add("deal");
		myList.add("delve");
		myList.add("dido");
		myList.add("don");

		System.out.println(myList);

		int size 		= myList.size();
		String control 	= "do";

		for (int i = 0; i < size; i++){
			//System.out.println(myList.get(i).substring(0,control.length()));

			if ( (myList.get(i).substring(0,control.length())).contains(control) ){
				System.out.println(myList.get(i));
			}
		}
	}
}
