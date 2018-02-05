package exercise.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *  You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * Created by pafer on 17-5-5.
 */
public class Solution {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap =  new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            Integer tmpIndex = numMap.get(target - nums[i]);
            if (tmpIndex != null) {
                return new int[]{tmpIndex, i};
            }
            numMap.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
       int [] nums = {2, 7, 11, 15};
        int[] ints = twoSum(nums, 17);
        if (ints != null) {
            System.out.println(ints[0] + " / " + ints[1]);
        }
    }
}
