class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return handlerFunction(nums, k) - handlerFunction(nums, k - 1);
    }
    public int handlerFunction(int nums[], int k) {
        if (k == 0)
            return 0;
        int ans = 0, diff = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0, j = 0; j < nums.length; j++) {
            hm.put(nums[j], hm.getOrDefault(nums[j], 0) + 1);
            if(hm.get(nums[j]) == 1)
                diff++;

            while(diff > k) {
                hm.put(nums[i], hm.get(nums[i]) - 1);
                if(hm.get(nums[i]) == 0)
                    diff--;
                i++;
            }
            ans += (j - i + 1);
        }
        return ans;
    }
}