class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0, count = 0;;
        for(; tickets[k] != 0; i++) {
            if(tickets[i % tickets.length] == 0)
                continue;
            else {
                tickets[i % tickets.length] -= 1;
                count++;
            }
        }
        return count;
    }
}