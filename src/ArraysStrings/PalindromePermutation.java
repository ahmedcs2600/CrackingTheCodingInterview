package ArraysStrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(isPossible("geeksforgeeks"));
    }

    static int isPossible(String S) {
        int length = S.length();

        Map<Character,Integer> memory = new HashMap<>();
        for(char ch : S.toCharArray()) {
            memory.put(ch, memory.getOrDefault(ch,0) + 1);
        }



        int evenCount = 0;
        int oddCount = 0;

        for(Map.Entry<Character,Integer> set : memory.entrySet()) {
            if(set.getValue() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if(length % 2 == 0) {
            return (oddCount == 0 && evenCount > 0) ? 1 : 0;
        }

        return oddCount == 1 && evenCount > 0 ? 1 : 0;
    }
}
