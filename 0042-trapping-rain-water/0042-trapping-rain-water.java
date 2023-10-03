class Solution {
    public int trap(int[] height) {
        int temp[] = new int[height.length];
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < height.length; i++){
            max = Math.max(max, height[i]);
            temp[i] = max;
        }
        max = Integer.MIN_VALUE;
        for(int i = height.length-1; i >= 0; i--){
            max = Math.max(max, height[i]);
            temp[i] = Math.min(temp[i], max);
        }

        for(int i = 0; i < height.length; i++){
            sum += temp[i] - height[i];
        }
        return sum;
    }
}