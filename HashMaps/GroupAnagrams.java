package HashMaps;

/*
* Expected Input: "eat", "tea", "tan", "ate", "nat", "bat"
* Expected Output: [[eat, tea, ate], [bat], [tan, nat]]
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        // Map to hold sorted word as key, and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // Convert word to char array, sort it, then use as key
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // Add the original word to the list corresponding to this key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        // Return all grouped anagrams
        // System.out.println(map.keySet());
        // System.out.println(map.values());
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] words = { "eat", "tea", "tan", "ate", "nat", "bat" };

        List<List<String>> result = groupAnagrams(words);

        System.out.println(result);
    }

}
