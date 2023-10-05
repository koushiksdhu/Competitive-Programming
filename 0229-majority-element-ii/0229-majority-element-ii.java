class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> al = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i : hm.keySet()){
            if(hm.get(i) > nums.length / 3)
                al.add(i);
        }
        return al;
    }
}