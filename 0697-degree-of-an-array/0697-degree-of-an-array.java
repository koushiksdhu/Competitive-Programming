class Solution {
    public int findShortestSubArray(int[] nums) {
       HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums) 
            hm.put(i, hm.getOrDefault(i, 0) + 1);

        ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<>(hm.entrySet());
        Collections.sort(al, (a, b) -> {
            return b.getValue() - a.getValue();
        });
        int degree = al.get(0).getValue();
        int min = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> idx : al){
          if (idx.getValue() == degree)
            min = Math.min(min, minArray(nums, idx.getKey()));
        }
       return min;
    }
    int minArray(int nums[], int x){
       int i = 0;
        while(nums[i] != x)
            i++;
        int j = nums.length - 1;
        while(nums[j] != x)
            j--;
        return j - i + 1;
    }
}