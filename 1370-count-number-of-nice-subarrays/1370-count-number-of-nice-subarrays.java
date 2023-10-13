class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // Brute Force: TLE
        
        // int ans = 0;
        // for(int i = 0; i < nums.length; i++){
        //     int count = 0;
        //     for(int j = i; j < nums.length; j++){
        //     count += nums[j] % 2 == 1 ? 1 : 0;
        //     if(count == k)
        //         ans++;
        //     if(count > k)
        //         break;
        //     }
        // }
        // return ans;




        // Optimized Appraoch:

        return handlerFunction(nums, k) - handlerFunction(nums, k-1);
    }
    public int handlerFunction(int arr[], int k){
        int ans = 0;
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            k -= arr[i] % 2;
            while(k < 0)
                k += arr[j++] % 2;
            ans += i - j + 1;
        }
        return ans;
    }
}