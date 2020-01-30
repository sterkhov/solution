class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
            for (int n=0;n<nums.length;n++) {
                if (n == i)
                    continue;
                if (nums[i]+nums[n]==target)
                    return new int[] {i,n};
            }
        return null;
    }
}