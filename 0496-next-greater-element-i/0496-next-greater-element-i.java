class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int nxtGreater = -1;
            int j = 0;
            while(nums2[j] != nums1[i])
                j++;
            for(; j < nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    nxtGreater = nums2[j];
                    break;
                }
            }
            ans[i] = nxtGreater;
        }
        return ans;
    }
}