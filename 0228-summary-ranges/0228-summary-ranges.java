class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> al = new ArrayList<>();
        if(nums.length == 0)
            return al;

        int i = 0, j = 1, k = 0;
        while(j < nums.length){
            if(nums[i + k]+1 == nums[j]){
                j++;
                k++;
            }
            else{
                if(nums[i] == nums[j-1])
                    al.add(""+nums[i]);
                else
                    al.add(""+nums[i]+"->"+nums[j-1]);
                i = j;
                j++;
                k = 0;
            }
        }
         if(nums[i] == nums[j-1])
                al.add(""+nums[i]);
            else
                al.add(""+nums[i]+"->"+nums[j-1]);
        return al;
    }
}