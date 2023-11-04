class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int seconds = 0;
        for(int i : left)
            seconds = Math.max(seconds, i - 0);
        for(int j : right)
            seconds = Math.max(seconds, n - j);
        return seconds;

    }
}