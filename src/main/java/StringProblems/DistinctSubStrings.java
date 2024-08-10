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

/*
Total Time Complexity
Considering the operations inside the loops and the loops themselves,
the dominant factor in the time complexity is the nested loops, each contributing
𝑂(𝑛2) and the substring operation contributing 𝑂(𝑛) on average:
O(n2) (iterations)*O(n) (substring extraction) = o(n3)
Thus, the overall time complexity of the program is 𝑂(𝑛3).
 */