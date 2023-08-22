class Solution {
    public String convertToTitle(int n) {

        StringBuilder sb = new StringBuilder();
        while(n > 0){
            n--;
            int rem = n % 26;
            sb.insert(0, (char)('A'+rem));
            n /= 26;
        }
        return sb.toString();
    }
}