class Solution {
    public int[] countBits(int n) {
        int arr[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            int count = 0;
            int temp = i;
            while(temp > 0){
                count += (temp & 1);
                temp >>= 1;
            }
            arr[i] = count;
        }
        return arr;
    }
}