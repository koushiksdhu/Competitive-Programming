class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxCount = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int left = 0;

        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            while(hm.get(nums[i]) > k) {
                hm.put(nums[left], hm.get(nums[left]) - 1);
                left++;
            }
            maxCount = Math.max(maxCount, i - left + 1);
        }
        return maxCount;
    }
}