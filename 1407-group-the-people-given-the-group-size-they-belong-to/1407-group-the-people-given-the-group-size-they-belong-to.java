class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> al = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(hm.containsKey(groupSizes[i])) 
                hm.get(groupSizes[i]).add(i);
            else 
                hm.put(groupSizes[i], new ArrayList<>(Arrays.asList(i)));
            
            if(hm.get(groupSizes[i]).size() == groupSizes[i]){
                al.add(hm.get(groupSizes[i]));
                hm.remove(groupSizes[i]);
            }
        }
        return al;
    }
}