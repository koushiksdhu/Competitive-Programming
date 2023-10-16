class Solution {
    public boolean canJump(int[] nums) {
        int possible = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > possible)
                return false;
            possible = Math.max(possible, i + nums[i]);
        }
        return true;
    }
}