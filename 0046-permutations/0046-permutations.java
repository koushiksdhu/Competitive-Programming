class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        permute(nums, 0, al);
        return al;

    }
    void permute(int nums[], int idx, List<List<Integer>> al) {
        if(idx == nums.length){
            List<Integer> per = new ArrayList<>();
            for(int i : nums)
                per.add(i);
            al.add(per);
            return;
        }
        for(int j = idx; j < nums.length; j++) {
            int temp = nums[idx];
            nums[idx] = nums[j];
            nums[j] = temp;

            permute(nums, idx+1, al);

            temp = nums[idx];
            nums[idx] = nums[j];
            nums[j] = temp;
        }
    }
}