class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        // METHOD 1:
        
        // ArrayList<String> al = new ArrayList<>();
        // Stack<Integer> stk = new Stack<>();
        // for(int i = 0, j = 0; i <= n && j < target.length; i++){
        //     stk.push(i+1);
        //     al.add("Push");
        //     if(stk.peek() != target[j]){
        //         stk.pop();
        //         al.add("Pop");
        //     }
        //     else {
        //         j++;
        //     }   
        // }
        // return al;



        // METHOD 2:

        ArrayList<String> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i : target)
            hs.add(i);
        
        for(int i = 1; i <= n; i++){
            if(hs.contains(i))
                al.add("Push");
            else {
                al.add("Push");
                al.add("Pop");
            }
            if(i == target[target.length-1])
                break;
        }
        return al;
    }
}