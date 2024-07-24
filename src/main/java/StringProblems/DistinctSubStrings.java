package StringProblems;

import java.util.HashSet;
import java.util.Set;

/*
    Given a string, count all distinct substrings of the given string.
    Input : abcd
    Output : abcd abc ab a bcd bc b cd c d
    All Elements are Distinct
 */
public class DistinctSubStrings {
    public static void main(String[] args) {
        String str = "srishti";
        findDistinctSubStrings(str);
    }

    private static void findDistinctSubStrings(String str) {
        Set<String> distinctSubstrings = new HashSet<>();
        for(int i=0;i<=str.length();i++){
            for(int j=i+1; j<=str.length();j++){
                distinctSubstrings.add(str.substring(i,j));
            }
        }
        System.out.println("Count :"+ distinctSubstrings.size());
        distinctSubstrings.forEach(System.out::println);
    }
}
