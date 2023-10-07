class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

    // Brute Force: TLE


    //    int ans[] = new int[nums.length - k + 1];
    //    int i = 0, j = 0, max = Integer.MIN_VALUE, count = 0;

    //    while(j < nums.length){
    //        if(count == k){
    //            ans[i] = max;
    //            i++;
    //            j = i;
    //            count = 0;
    //            max = Integer.MIN_VALUE;
    //        }
    //        else{
    //            max = Math.max(max, nums[j]);
    //            j++;
    //            count++;
    //        }
    //    }
    //    ans[i] = max;
    //    return ans;




    // Optimized Approach: Using Deque:

    int ans[] = new int[nums.length - k + 1];
    int idx = 0;

    Deque<Integer> dq = new LinkedList<>();
    for(int i = 0; i < nums.length; i++){
        if(!dq.isEmpty() && dq.peek() == i-k)
            dq.poll();
        
        while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
            dq.pollLast();

        dq.offer(i);
        if(i >= k - 1)
            ans[idx++] = nums[dq.peek()];
    }
    return ans;
    }
}