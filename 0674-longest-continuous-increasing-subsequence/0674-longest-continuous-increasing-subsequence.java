class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int currentMax = 1;
        if(nums.length <= 1 ){
            return nums.length;
        }
        for(int i= 1 ; i< nums.length ; i++){
            if (nums[i] > nums[i-1]){
                currentMax++;
                 if( currentMax > max) {
                     max = currentMax;
                 }
            }else {
                     currentMax = 1;
                     }
                 }  
         return max; 
    }
}
    