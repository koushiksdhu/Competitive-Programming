class Solution {
    public long minimumReplacement(int[] nums) {
        long result = 0;
        int lastEle = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] > lastEle){
                int split = nums[i] / lastEle;
                if(nums[i] % lastEle != 0){
                    split++;
                    lastEle = nums[i]/split;
                }
                result += split-1;
            }
            else{
                lastEle = nums[i];
            }
        }
        return result;
    }
}