package problems.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * from leetcode.com
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new LinkedList<>();

        if (nums == null || nums.length < 3) {
            return triplets;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]) j++;
                    while (j < k && nums[k] == nums[k+1]) k--;
                } else {
                    if (nums[i] + nums[j] + nums[k] > 0) {
                        k--;
                    } else{
                        j++;
                    }
                }
            }
        }

        return triplets;

    }
}
