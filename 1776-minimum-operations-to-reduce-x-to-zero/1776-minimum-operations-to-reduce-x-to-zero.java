class Solution {
    public int minOperations(int[] nums, int x) {
       int target = -x;
       for(int i : nums){
           target += i;
       }
        if(target == 0)
            return nums.length;

       int currSum = 0;
       int i = 0, j = 0, max = 0;

       for(j = 0; j < nums.length; j++){
           currSum += nums[j];
           while(i <= j && currSum > target){
               currSum -= nums[i++];
           }
           if(currSum == target)
            max = Math.max(max, j-i+1);
       }
       return max == 0 ? -1 : nums.length-max;
    }
}