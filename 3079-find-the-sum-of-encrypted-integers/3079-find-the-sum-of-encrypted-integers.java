class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += helperFunction(nums[i]);
        }
        return sum;
    }
    int helperFunction(int num) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        while(num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
            count++;
        }
        int ans = 0;
        while(count-- > 0) {
            ans = ans * 10 + max;
        }
        return ans;
    }
}