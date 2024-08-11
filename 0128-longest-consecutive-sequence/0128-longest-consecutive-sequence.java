class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int i : nums)
            hs.add(i);

        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i] - 1)) {
                count = 1;
                int el = nums[i];
                while(hs.contains(el + 1)) {
                    count++;
                    el++;
                }
                max = Math.max(max, count);
            }
        }
        return Math.max(count, max);
    }
}