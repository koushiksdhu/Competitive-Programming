class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> al = new ArrayList<>();
        findC(0, candidates, target, al, new ArrayList<>());
        return al;

    }
    void findC(int idx, int arr[], int sum, List<List<Integer>> al, List<Integer> temp){
        if(idx == arr.length){
            if(sum == 0)
                al.add(new ArrayList<> (temp));
            return;
        }
        if(arr[idx] <= sum){
            temp.add(arr[idx]);
            findC(idx, arr, sum-arr[idx], al, temp);
            temp.remove(temp.size()-1);
        }
        findC(idx+1, arr, sum, al, temp);
    }
}