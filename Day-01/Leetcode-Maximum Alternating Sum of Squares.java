import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int size = nums.length;
        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);

        long sum1 = 0, sum2 = 0;

        for (int i = 0; i < mid; i++) {
            sum1 += nums[i];
        }

        for (int i = mid; i < size; i++) {
            sum2 += nums[i];
        }

        return sum2 - sum1;
    }
}
