class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int idx = -1, lIdx = -1, rIdx = -1;

        for(int i = 0; i < nums.length; i++) {
            if(!(minK <= nums[i] && nums[i] <= maxK))
                idx = i;

            if(nums[i] == minK)
                lIdx = i;

            if(nums[i] == maxK)
                rIdx = i;

            ans += Math.max(0, Math.min(lIdx, rIdx) - idx);
        }
        return ans;
    }
}