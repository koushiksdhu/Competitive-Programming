class Solution {
    public int minTaps(int n, int[] ranges) {
        int arr[] = new int[n+1];
        Arrays.fill(arr, 0);
        for(int i = 0; i < ranges.length; i++){
            if(ranges[i] == 0)
                continue;

            int left = Math.max(0, i - ranges[i]);
            arr[left] = Math.max(arr[left], i + ranges[i]);
        }

       int currIdx = 0, farIdx = 0, count = 0;
       for(int i = 0; i <= n; i++){
           if(i > currIdx){
               if(farIdx <= currIdx)
                    return -1;
                currIdx = farIdx;
                count++; 
           }
           farIdx = Math.max(farIdx, arr[i]);
       } 
       return count + (currIdx < n ? 1 : 0);
    }
}