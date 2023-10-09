class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i : arr)
            ts.add(i);
        
        int idx = 1;
        for(int i : ts)
            hm.put(i, idx++);

        for(int i = 0; i < arr.length; i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;       
    }
}