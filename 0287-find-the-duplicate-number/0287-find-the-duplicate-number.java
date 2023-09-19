class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]);
            if(nums[idx] < 0)
                return Math.abs(idx);
            else
                nums[idx] *= -1;
        }
        return -1;
    }
}