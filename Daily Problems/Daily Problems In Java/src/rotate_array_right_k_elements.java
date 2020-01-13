import java.util.*;

public class rotate_array_right_k_elements {
    /*  Author: Octavian Stoch
        Date:   1/13/2020
    Given an array and a number k that's smaller than
    the length of the array, rotate the array to the right
    k elements in-place.*/

    private static void solution(){
        ArrayList<Integer> inputList = makeRandomSizeArray(10);     //make random size array(size 10)
        System.out.println(inputList);                                 //print out array
        moveKElementsInPlace(inputList, 4);                 //move k times to the right
    }

    private static void moveKElementsInPlace (ArrayList<Integer> inputArrayList, int kElements) {
        ArrayList<Integer> finalArrayList       = new ArrayList<Integer>();
        ArrayList<Integer> listToAppend         = new ArrayList<Integer>();
        //finalArrayList                          = inputArrayList;
        int sizeOfInputArrayList    = inputArrayList.size()-kElements-1; //start at kElements index
        int sizeOfInputArrayList2   = inputArrayList.size()-kElements-1;
        int modify = kElements;

        for (int i = modify; i != 0; i--) { //while i isn't equal to 0 decrement and add to list
            listToAppend.add(inputArrayList.get(sizeOfInputArrayList+=1));
        }

        for (int i = 0; i < inputArrayList.size()-kElements; i++) {
            finalArrayList.add(inputArrayList.get(i));
        }

        System.out.println(listToAppend + "\n" + finalArrayList);
        for (int i = 0; i < finalArrayList.size(); i++) {
            listToAppend.add(finalArrayList.get(i));

        }
        System.out.println(listToAppend);
    }

    private static ArrayList<Integer> makeRandomSizeArray(int n) {
        ArrayList<Integer> myList = new ArrayList<Integer>();   //make a ArrayList obj
        Random randomNumberGen = new Random();                  //make a random obj

        for (int i = 0; i < n; i++){
            myList.add(randomNumberGen.nextInt(20));    //add random number 0-20 to myList
        }

        return myList;
    }

    public static void main (String[] args) {
        solution();
    }
}
