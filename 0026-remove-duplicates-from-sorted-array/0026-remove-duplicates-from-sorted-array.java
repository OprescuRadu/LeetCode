class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1 ; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
            return k;
    //     int readIt = 1, writeIt = 0;
    //  while (readIt < nums.length) {
    //   if (nums[readIt] != nums[writeIt]) {
    //       nums[writeIt+1] = nums[readIt];
    //       writeIt++;
    //   }
    //   readIt++;
    // }
    // return writeIt + 1;
    }
}