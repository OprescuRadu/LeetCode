class Solution {
    public int rob(int[] nums) {
         if(nums.length == 1) {
            return nums[0];
        }

        int before_last_rob = 0;
        int prev_rob = nums[0]; 
        for (int i = 1; i < nums.length; i++) {   
            int rob = Math.max(nums[i] + before_last_rob,prev_rob);
            before_last_rob = prev_rob;
            prev_rob = rob;
        }
        return prev_rob;
    }
}

