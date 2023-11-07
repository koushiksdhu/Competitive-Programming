class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double time[] = new double[speed.length];
        for(int i = 0; i < dist.length; i++){
            time[i] = (double)dist[i] / speed[i];
        }

        Arrays.sort(time);

        for(int i = 0; i < time.length; i++) {
            if(time[i] <= i)
                return i;
        }
        return dist.length;
    }
}