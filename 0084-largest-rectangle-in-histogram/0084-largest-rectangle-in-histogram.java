class Solution {
    public int largestRectangleArea(int[] heights) {

        // BRUTE FORCE:

        // int max = Integer.MIN_VALUE;
        // for(int i = 0; i < heights.length; i++){
        //     int count = 1;
        //     int j = i+1;
        //     while(j < heights.length){
        //         if(heights[i] <= heights[j]){
        //             count++;
        //             j++;
        //         }
        //         else
        //             break;
        //     }

        //     j = i-1;
        //     while(j >= 0){
        //         if(heights[i] <= heights[j]){
        //             count++;
        //             j--;
        //         }
        //         else
        //             break;
        //     }
        //     max = Math.max(max, (heights[i] * count));
        // }
        // return max;




        // OPTIMIZED APPROACH:

        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        int max = Integer.MIN_VALUE;
        Stack<Integer> idx = new Stack<>();

        for(int i = 0; i < heights.length; i++){
            while(!idx.isEmpty() && heights[idx.peek()] >= heights[i])
                idx.pop();
            if(!idx.isEmpty())
                left[i] = idx.peek()+1;
            else
                left[i] = 0;
            idx.push(i);
        }
        idx.clear();

        for(int i = heights.length - 1; i >= 0; i--){
            while(!idx.isEmpty() && heights[idx.peek()] >= heights[i])
                idx.pop();
            if(!idx.isEmpty())
                right[i] = idx.peek()-1;
            else
                right[i] = heights.length - 1;
            idx.push(i);
        }
        for(int i = 0; i < heights.length; i++){
            max = Math.max(max, ((right[i]-left[i]+1) * heights[i]));
        }
        return max;
    }
}