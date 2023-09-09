class Solution {
    public int findSpecialInteger(int[] arr) {
        int noOfTime = (int)(arr.length * 0.25);
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        for(int i : hm.keySet()){
            if(hm.get(i) > noOfTime)
                return i;
        }
        return -1;
    }
}