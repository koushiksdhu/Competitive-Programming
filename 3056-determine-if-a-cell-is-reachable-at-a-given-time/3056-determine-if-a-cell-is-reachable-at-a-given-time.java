class Solution {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int x = Math.abs(sx - fx);
        int y = Math.abs(sy - fy);
        int minDistance = Math.min(x, y) + Math.abs(x - y);
        if(minDistance == 0)
            return t != 1;
        return t >= minDistance;
    }
}