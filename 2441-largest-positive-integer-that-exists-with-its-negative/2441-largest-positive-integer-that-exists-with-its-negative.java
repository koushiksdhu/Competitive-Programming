class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = -1;
        for(int i = 0; i < nums.length; i++) {
            if(hs.contains(nums[i] * -1))
                max = Math.max(Math.abs(nums[i]), max);
            hs.add(nums[i]);
        }
        return max;
    }
}