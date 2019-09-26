package staircaseRows;

public class rows_problem {
	
	/*
	staircase problem
	example: n = 8
	stairs: x		1
			x x		3
			x x x	6
			x x x x	10
	result should be 3 because 8 < 10
	*/
	
	public static int stairs(int n) {
		int res 	= 0;	//final result
		int test	= n;	//control
		int stairs	= 1;	//number of rows
		
		while (test > stairs) {
			test = test - stairs;
			res++;
			stairs++;
		}
		
		System.out.println(res);
		return res;
	}

	public static void main(String[] args) {
		stairs(8);
		stairs(12);
		stairs(34);
		System.out.println("test print");

	}

}
