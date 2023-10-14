class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = Integer.MIN_VALUE;
        int sum1 = 0, sum2 = 0;

        for(int i = 0; i < k;  i++)
            sum1 += cardPoints[i];

        max = Math.max(max, sum1);
        for(int i = 0; i < k; i++){
            sum2 += cardPoints[cardPoints.length - i - 1];
            sum1 -= cardPoints[k - i - 1];
            max = Math.max(sum1 + sum2, max);
        }
        return max;
    }
}