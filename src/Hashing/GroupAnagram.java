package Hashing;

// This is a leetcode question.

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        groupanagram(strs);
    }
    static void groupanagram(String[] input) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            char[] sortedArray = input[i].toCharArray();
            Arrays.sort(sortedArray);
            String sortedKey = new String(sortedArray);
            if (map.containsKey(sortedKey)) {
                List<String> analist = map.get(sortedKey);
                analist.add(input[i]);
                map.put(sortedKey,analist);
            }else {
                List<String> anaList = new ArrayList<>();
                anaList.add(input[i]);
                map.put(sortedKey,anaList);
            }
        }
        for (String str : map.keySet()) {
            System.out.println(str + " -> " + map.get(str));
        }
    }

}
