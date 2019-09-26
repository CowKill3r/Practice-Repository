package staircaseRows;
import java.util.*;
import java.util.Map.Entry;

public class top_K_most_fequent_numbers {
	
	/*
	 * find the top most frequent number(s) where ls is a list of integers,
	 * ls isn't gauranteed to be sorted, and n is the number of integers that 
	 * it wants going from greatest -> least.d
	 * 
	 * practice with hashmaps
	 */
	
	private static int currentMaxValue;

	public static ArrayList<Integer> manyNums (ArrayList<Integer> ls, int n){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i : ls) { //for each int in arraylist ls
			if (!map.containsKey(i))
				map.put(i, 1); //if the key does not exist then it appeared for the first time
			else
				map.put(i, map.get(i) + 1); //otherwise the value already exists and we increment
		}
				
		int temp = n;
		while (temp != 0) {
			//System.out.println(map);
			currentMaxValue = Collections.max(map.values());
			
			
			Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator(); //iterator to iterate through the hashmap
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry)it.next();
				//System.out.println(pair.getKey() + " = " + pair.getValue());
				
				if (pair.getValue().equals(currentMaxValue)) {  //comparing the value of current pair with the maxvalue found in collections.max
					System.out.println("Most frequent int: " + pair.getKey() + "\n" + "With a value of: " + pair.getValue() + "\n\n");
					map.remove(pair.getKey());  //remove the key corresponding to the maxvalue to get the next one
					break; //break fixes bug. im not sure why
				}
				//it.remove();
			}

			
			temp--;
			
		}
		
		return null;
	}

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(12);
		myList.add(1);
		myList.add(3);
		myList.add(2);
		myList.add(2);
		manyNums(myList, 3);
	}

}
