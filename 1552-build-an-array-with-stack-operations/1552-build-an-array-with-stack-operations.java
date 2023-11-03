class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> al = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i = 0, j = 0; i <= n && j < target.length; i++){
            stk.push(i+1);
            al.add("Push");
            if(stk.peek() != target[j]){
                stk.pop();
                al.add("Pop");
            }
            else {
                j++;
            }   
        }
        return al;
    }
}