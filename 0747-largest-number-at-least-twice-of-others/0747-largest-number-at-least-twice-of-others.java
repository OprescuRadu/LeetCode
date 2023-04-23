class Solution {
    public int dominantIndex(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = -2;
        for(int i = 0 ; i < nums.length; i++){
            if((nums[i] > max)){
                max = nums[i];
                index = i;
            }
        }
        for(int i = 0 ; i < nums.length; i++){
            if(max != nums[i] && max/2  < nums[i] ){
                return -1;
            }
        }
        return index;
    }
}