class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i : nums1)
            al.add(i);

        for(int i : nums2){
            if(al.contains(i)){
                ans.add(i);
                al.remove(al.indexOf(i));
            }
        }
        int arr[] = new int[ans.size()];
        int idx = 0;
        for(int i : ans)
            arr[idx++] = i; 
        return arr;
    }
}