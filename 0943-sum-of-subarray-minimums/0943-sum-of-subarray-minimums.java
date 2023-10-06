class Solution {
    public int sumSubarrayMins(int[] arr) {
        long ans = 0;
        Stack<Integer> stk = new Stack<>();
        long MOD = (long)1e9+7;
        stk.push(-1);
        for(int i = 0; i <= arr.length; i++){
            int currVal = (i <= arr.length-1) ? arr[i] : 0;
            while(stk.peek() != -1 && currVal < arr[stk.peek()]){
                int idx = stk.pop();
                int j = stk.peek();
                int left = idx - j;
                int right = i - idx;
                long add = (left * right * (long)arr[idx]) % MOD;
                ans = ((ans % MOD) + (add % MOD)) % MOD;
            }
            stk.push(i);
        }
        return (int)ans;
    }
}