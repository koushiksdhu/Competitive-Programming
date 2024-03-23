class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            HashSet<Integer> hs1 = new HashSet<>();
            for(int j = 0; j <= i; j++)
                hs1.add(nums[j]);

            HashSet<Integer> hs2 = new HashSet<>();
            for(int j = i+1; j < nums.length; j++)
                hs2.add(nums[j]);

            arr[i] = hs1.size() - hs2.size();
        }
        return arr;
    }
}