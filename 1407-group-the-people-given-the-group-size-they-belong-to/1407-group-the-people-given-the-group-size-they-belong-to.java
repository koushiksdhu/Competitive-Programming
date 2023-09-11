class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> al = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        for(int i = 0; i < groupSizes.length; i++){
            if(hm.containsKey(groupSizes[i])){
                ArrayList<Integer> temp = hm.get(groupSizes[i]);
                temp.add(i);
                hm.put(groupSizes[i], temp);
                if(hm.get(groupSizes[i]).size() == groupSizes[i]){
                    al.add(hm.get(groupSizes[i]));
                    hm.remove(groupSizes[i]);
                }
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(i);
                hm.put(groupSizes[i], temp);
                if(hm.get(groupSizes[i]).size() == groupSizes[i]){
                    al.add(hm.get(groupSizes[i]));
                    hm.remove(groupSizes[i]);
                }
            }
        }
        return al;
    }
}