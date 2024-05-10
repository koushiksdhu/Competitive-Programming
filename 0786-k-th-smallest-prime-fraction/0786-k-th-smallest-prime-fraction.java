class Pair {
    int n1, n2;
    Pair(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
}

class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        TreeMap<Double, Pair> tm = new TreeMap<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                tm.put((double)arr[i] / arr[j], new Pair(arr[i], arr[j]));
            }
        }
        int ans[] = new int[2];
        for(Map.Entry<Double, Pair> itr : tm.entrySet()) {
            k--;
            if(k == 0) {
                ans[0] = itr.getValue().n1;
                ans[1] = itr.getValue().n2;
                break;
            }
        }
        return ans;
    }
}