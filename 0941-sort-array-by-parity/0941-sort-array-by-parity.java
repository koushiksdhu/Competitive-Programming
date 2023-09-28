class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i : nums){
            if(i % 2 == 0)
                even.add(i);
            else
                odd.add(i);
        }

        int i = 0;
        for(int j : even)
            nums[i++] = j;
        for(int j : odd)
            nums[i++] = j;

        return nums; 
    }
}