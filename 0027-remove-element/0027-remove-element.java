class Solution {
    public int removeElement(int[] nums, int val) {
        int okValue = 0;
        for(int i = 0; i < nums.length; i++){
            if(val != nums[i]){
                nums[okValue] = nums[i];
                    okValue++;
                }           
        }
        return okValue;
    }
}

