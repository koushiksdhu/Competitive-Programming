class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : nums) 
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        
        for(int i : hm.values()) {
            if(i > 2)
                return false;
        }
        return true;
    }
}