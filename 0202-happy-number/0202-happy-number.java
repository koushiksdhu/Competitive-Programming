class Solution {
    public boolean isHappy(int n) {
        if(n < 0)
            return false;

        int slow = n;
        int fast = n;

        do {
            slow = powerSum(slow);
            fast = powerSum(powerSum(fast));
        } while(slow != fast);

        return slow == 1;
    }
    static int powerSum(int x){
        int sum = 0;
        while(x > 0){
            sum += (int)(Math.pow(x % 10, 2));
            x /= 10;
        }
        return sum;
    }
}