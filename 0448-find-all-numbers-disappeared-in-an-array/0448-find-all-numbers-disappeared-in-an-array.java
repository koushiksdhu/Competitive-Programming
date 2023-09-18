class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // HashSet<Integer> hs = new HashSet<>();
        // ArrayList<Integer> al = new ArrayList<>();
        // for(int i : nums)
        //     hs.add(i);

        // for(int i = 1; i <= nums.length; i++){
        //     if(!hs.contains(i))
        //         al.add(i);
        // }
        // return al;




        // OPTIMIZED APPROACH:
        int temp[] = new int[nums.length];
        for(int i : nums){
            temp[i-1]++;
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == 0)
                al.add(i+1);
        }
        return al;
    }
}