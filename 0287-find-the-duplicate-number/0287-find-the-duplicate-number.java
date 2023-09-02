class Solution {
    public int findDuplicate(int[] arr) {
       for(int i = 0; i < arr.length; i++){
            int temp = Math.abs(arr[i]);
            if(arr[temp] >= 0)
                arr[temp] *= -1;
            else
                return Math.abs(temp);
       }
       return -1;
    }
}