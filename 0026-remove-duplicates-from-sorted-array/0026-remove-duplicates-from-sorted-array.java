class Solution {
    public int removeDuplicates(int[] nums) {
    //     int i = 0;
    //     for(int j = 1; j < nums.length; j++){
    //         if(nums[i] !=  nums[j]){
    //             i++;
    //             nums[i] = nums[j];
    //         }
    //     }
    //     return i+1;
    
    ArrayList<Integer> al = new ArrayList<>();
    for(int i : nums){
        if(!al.contains(i))
            al.add(i);
    }
    for(int i = 0; i < al.size(); i++){
        nums[i] = al.get(i);
    }
    return al.size();
    }
}