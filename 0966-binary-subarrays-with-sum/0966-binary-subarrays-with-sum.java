class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {

        // Brute Force:

        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int sum = 0;
        //     for(int j = i; j < nums.length; j++){
        //         sum += nums[j];
        //         if(sum == goal)
        //             count++;
        //     }
        // }
        // return count;




        // Optimized approach:

        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        int currSum = 0, count = 0;
        for(int i : nums) {
            currSum += i;
            count += hm.getOrDefault(currSum - goal, 0);
            if(hm.containsKey(currSum))
                hm.put(currSum, hm.get(currSum) + 1);
            else
                hm.put(currSum, 1);
        }
        return count;
    }
}