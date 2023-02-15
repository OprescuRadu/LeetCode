class Solution {
    public int search(int[] nums, int target) {
        int start = dividEtImpera(nums);
        if (start == 0){
            return binarySearch(nums, target, 0, nums.length-1);
        } else {
            int left = binarySearch(nums, target, 0, start -1);
            int right = binarySearch(nums, target, start, nums.length-1);
            if(left >= 0){
                return left;
            }
            return right;
        }
        
    }
    
    public int dividEtImpera(int[] nums){
        int L = 0;
        int R = nums.length-1;
        if(nums[0] <= nums[R]){
            return 0;
        }
        while (R-L > 1){
            int M = (L+R)/2;
            if(nums[L] > nums[M]){
                R = M;
            } else {
                L = M;
            }
        }
        int result = L;
        if(nums[R] < nums[L]){
            result = R;
        }
        return result;
    }
    
    public static int binarySearch(int[] sortedList, int key, int left, int right){
        while (left <= right) {
        int middle = (left + right) / 2;
        if (key == sortedList[middle]) {
            return middle;
       } else if (key < sortedList[middle]) {
            right = middle - 1;
       } else if (key > sortedList[middle]) {
            left  = middle + 1;
       }
     }
     return -1;
     }
}