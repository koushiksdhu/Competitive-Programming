class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int mid = search(nums, target);
        if(mid == -1){
            int ans[] = {-1, -1};
            return ans;
        }
        if(nums.length == 1){
            int ans[] = {0, 0};
            return ans;
        }
    
        int i = mid, j = mid;
        while(i >= 0 && nums[i] == target)
            i--;
        while(j < nums.length && nums[j] == target)
            j++;
        int ans[] = {i+1, j-1};
        return ans;
    }
    int search(int nums[], int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}