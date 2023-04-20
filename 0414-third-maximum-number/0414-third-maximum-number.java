class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            tree.add(nums[i]);
        }
        Iterator<Integer> it = tree.descendingIterator();
        int count = 0;
    
        if(tree.size() <=2 ){
            return it.next();
        }
        while(it.hasNext() && count < 2 ){
        it.next();
        count++;
        }
    return it.next();
    }
}