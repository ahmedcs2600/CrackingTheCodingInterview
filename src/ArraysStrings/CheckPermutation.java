package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class CheckPermutation {
    public static void main(String[] args) {
        isAnagram("geeksforgeeks","forgeeksgeeks");
    }

    public static boolean isAnagram(String s,String t){
        Map<Character,Integer> s1Map = new HashMap<>();
        Map<Character,Integer> s2Map = new HashMap<>();

        for(char ch : s.toCharArray()) {
            s1Map.put(ch,s1Map.getOrDefault(ch,0) + 1);
        }

        for(char ch : t.toCharArray()) {
            s2Map.put(ch,s2Map.getOrDefault(ch,0) + 1);
        }


        if(s1Map.size() != s2Map.size()) return false;



        for(Map.Entry<Character,Integer> entry : s1Map.entrySet()) {
            int value = entry.getValue();
            int other = s2Map.getOrDefault(entry.getKey(),0);
            if(value != other) {
                return false;
            }
        }

        return true;
    }
}
