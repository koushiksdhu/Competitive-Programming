class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     Arrays.sort(nums);
    //     HashSet<List<Integer>> hs = new HashSet<>(); 
    //     subset(nums, 0, hs, new ArrayList<>());
    //     List<List<Integer>> al = new ArrayList<>();
    //     for(List<Integer> i : hs)
    //         al.add(new ArrayList<>(i));
    //     return al;
    // }
    // void subset(int nums[], int idx, HashSet<List<Integer>> hs, List<Integer> temp){
    //     if(idx == nums.length){
    //         hs.add(new ArrayList<>(temp));
    //         return;
    //     }
    //     temp.add(nums[idx]);
    //     subset(nums, idx+1, hs, temp);
    //     temp.remove(temp.size()-1);
    //     subset(nums, idx+1, hs, temp);



    // OPTIMIZED WAY:

    Arrays.sort(nums);
    List<List<Integer>> al = new ArrayList<>();
    findSub(nums, 0, al, new ArrayList<>());
    return al;
    }
    void findSub(int nums[], int idx, List<List<Integer>> al, List<Integer> temp){
        al.add(new ArrayList<>(temp));
        for(int i = idx; i < nums.length; i++){
            if(i != idx && nums[i-1] == nums[i])
                continue;
            temp.add(nums[i]);
            findSub(nums, i+1, al, temp);
            temp.remove(temp.size()-1);
        }
    }
}