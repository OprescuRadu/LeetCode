class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] == 1){
            return 0;
        }
        for(int i = 1 ; i < nums.length; i++){
            if(nums[i-1] + 1 != nums[i]){
                return nums[i-1] + 1;
            }
        }
        return nums.length;  
    }
}