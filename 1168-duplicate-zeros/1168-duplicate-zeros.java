class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                al.add(arr[i]);
                al.add(arr[i]);
            }
            else
                al.add(arr[i]);
            if(al.size() == arr.length)
                break;
        }
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = al.get(i);
        }
    }
}