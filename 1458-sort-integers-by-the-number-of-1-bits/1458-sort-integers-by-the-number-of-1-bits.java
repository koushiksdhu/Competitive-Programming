class Solution {
    public int[] sortByBits(int[] arr) {
        ArrayList<Pair<Integer, Integer>> al = new ArrayList<>();
        for(int i : arr) {
            al.add(new Pair(i, noOfBits(i)));
        }
        Collections.sort(al, (a, b) -> {
            return a.getValue() != b.getValue() ? a.getValue() - b.getValue() : a.getKey() - b.getKey();
        });
        int ans[] = new int[al.size()];
        int i = 0;
        for(Pair<Integer, Integer> idx : al)
            ans[i++] = idx.getKey();

        return ans;
    }

    int noOfBits(int n) {
        int count = 0;
        while(n > 0) {
            if((n&1) == 1)
                count++;
            n >>= 1;
        }
        return count;
    }
}