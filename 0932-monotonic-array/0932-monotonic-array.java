class Solution {
    public boolean isMonotonic(int[] nums) {
        int a = 0, b = 1;
        while(b < nums.length && nums[a] == nums[b])
            b++;
        if(b == nums.length)
            return true;
       int n = nums[a] - nums[b];
       
       if(n < 0){
           for(int i = 0; i < nums.length-1; i++){
               if(nums[i] > nums[i+1])
                return false;
           }
       }
       else if(n > 0){
           for(int i = 0; i < nums.length-1; i++){
               if(nums[i] < nums[i+1])
                return false;
           }
       }
       return true;
    }
}