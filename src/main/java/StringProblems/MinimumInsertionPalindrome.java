package StringProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
Minimum insertions to form a palindrome with permutations allowed

 The idea is to count the occurrence of each character in a string.
 As a palindromic string can have one character which occurs odd times,
 so the number of insertion will be one less than the count of characters that occur at odd times.
 And if the string is already palindrome, we do not need to add any character, so the result will be 0.
 */
public class MinimumInsertionPalindrome {
    public static void main(String[] args) {
        String str = "geeksgeeks";
        System.out.println("Minimum insertion required to make a string palindrome "+ minInsertion(str));

    }

    private static long minInsertion(String str) {
        if(str.isEmpty())
            return 0;

        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        long oddCount = map.values()
                .stream()
                .filter(x -> x % 2 != 0)
                .count();
        return oddCount > 0 ? oddCount -1 : oddCount;
    }
}
