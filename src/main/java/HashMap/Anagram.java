package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "srishti";
        String str2 = "rishtis";
        if(isAnagrm(str1, str2)){
            System.out.println("Yes the strings are anagrams");
        }else
            System.out.println("No, They are not anagrams");
    }

    private static boolean isAnagrm(String str1, String str2){
        if(str1.length() != str2.length())
            return false;

        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str1.toCharArray()){
            charCountMap.put(c, charCountMap.getOrDefault(c,0)+1);
        }
        for (char c : str2.toCharArray()){
            if(!charCountMap.containsKey(c))
                return false;
            charCountMap.put(c, charCountMap.get(c) - 1);
            if(charCountMap.get(c) == 0)
                charCountMap.remove(c);
        }
        return charCountMap.isEmpty();
    }
}
