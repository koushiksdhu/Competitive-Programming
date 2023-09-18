class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> hm = new LinkedHashMap<>();

        for(int i = 0; i < mat.length; i++){
            int ones = 0;
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1)
                    ones++;
            }
            hm.put(i, ones);
        }

        ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<>(hm.entrySet());
        Collections.sort(al, new Comparator <Map.Entry<Integer, Integer>>(){
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2){
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        int res[] = new int[k];
        int j = 0;
        for(Map.Entry<Integer, Integer> i : al){
            res[j++] = i.getKey();
            if(j == k)
                break;
        }
        return res;
    }
}