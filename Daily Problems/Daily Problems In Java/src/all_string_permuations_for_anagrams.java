import java.util.*;

public class all_string_permuations_for_anagrams {
    private static ArrayList<String> getSubStrings(String inputString){
        ArrayList<String> result = new ArrayList<String>();

        for (int outer = 0; outer < inputString.length(); outer++){
            for (int inner = outer + 1; inner < inputString.length()+1; inner++){
                result.add(inputString.substring(outer, inner));
            }
        }

        System.out.println(result);
        return result;
    }

    public static void main(String[] args){
        getSubStrings("aabcd");
    }
}
