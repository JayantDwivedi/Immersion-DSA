package Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSumOnePass {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        twosumsonepass(nums,target);
    }
    static void twosumsonepass(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int search = target - nums[i];
             if (map.containsKey(search)) {
                 result[0] = i;
                 result[1] = map.get(search);
                 break;
             }
             map.put(nums[i],i);
        }

        for(int i : result) {
            System.out.print(i + " ");
        }
    }
}
