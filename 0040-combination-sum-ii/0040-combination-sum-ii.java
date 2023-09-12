class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    //  TLE CODE:
        
    //     Arrays.sort(candidates);
    //     HashSet<List<Integer>> hs = new HashSet<>();
    //     findC(0, candidates, target, hs, new ArrayList<>());
    //     List<List<Integer>> ans = new ArrayList<>(hs);
    //     return ans;
    // }
    // void findC(int idx, int candidates[], int target, HashSet<List<Integer>> hs, List<Integer> temp){
    //     if(idx == candidates.length){
    //         if(target == 0)
    //             hs.add(new ArrayList<>(temp));
    //         return;
    //     }

    //     if(candidates[idx] <= target){
    //         temp.add(candidates[idx]);
    //         findC(idx+1, candidates, target-candidates[idx], hs, temp);
    //         temp.remove(temp.size()-1);
    //     }
    //     findC(idx+1, candidates, target, hs, temp);








    // OPTIMIZED APPROACH:

    Arrays.sort(candidates);
    List<List<Integer>> al = new ArrayList<>();
    findC(0, candidates, target, al, new ArrayList<>());
    return al;


    
    }
    void findC(int idx, int candidates[], int target, List<List<Integer>> al, List<Integer> temp){
        if(target == 0){
            al.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i < candidates.length; i++){
            if(idx < i && candidates[i] == candidates[i-1])
                continue;
            if(candidates[i] > target)
                break;
            
            temp.add(candidates[i]);
            findC(i+1, candidates, target-candidates[i], al, temp);
            temp.remove(temp.size()-1);
        }
    }
}