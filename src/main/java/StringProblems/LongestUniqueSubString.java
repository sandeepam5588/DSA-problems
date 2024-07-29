package StringProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String str = "abcabcbbd";
        System.out.println("Length of unique longest substring "+ lengthOfUniqueLongestSubstring(str));
    }

    private static int lengthOfUniqueLongestSubstring(String str) {
        if(str.isEmpty())
            return 0;

        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        for(int right=0; right<str.length(); right++){
            char currentChar = str.charAt(right);
            if(map.containsKey(currentChar)){
                left = Math.max(map.get(currentChar)+1, left);
            }
            map.put(currentChar, right);
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
