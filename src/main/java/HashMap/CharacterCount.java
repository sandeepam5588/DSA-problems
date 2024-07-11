package HashMap;

import java.util.Map;
import java.util.HashMap;

class CharacterCount {
    public static void main(String[] args) {
        String str = "Srishti";
        Map<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
