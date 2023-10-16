class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            al.add(pascal(rowIndex, i));
        }
        return al;
    }
    int pascal(int r, int c){
        long prod = 1;
        for(int i = 0; i < c; i++){
            prod *=  r - i;
            prod /= i + 1;
        }
        return (int)prod;
    }
}