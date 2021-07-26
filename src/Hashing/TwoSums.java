package Hashing;

import java.util.HashMap;
import java.util.Map;

// Leetcode
public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twosums(nums,target);
    }
    static void twosums(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        System.out.println(map);

        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
            if (map.containsKey(search)) {

                result[0] = i;
                result[1] = map.get(search);
                break;
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
