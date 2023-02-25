class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numbersOfElements = new HashMap<Integer, Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(numbersOfElements.containsKey(nums[i])){
                int frequence = numbersOfElements.get(nums[i]) + 1;
                numbersOfElements.put(nums[i], frequence);
            }
            else{
                numbersOfElements.put(nums[i],1);
            }
        }  
        int max = 0;
        int originalIndex = 0;
        for(Map.Entry <Integer,Integer> entry: numbersOfElements.entrySet()){
            int index = entry.getKey();
            int maxim = entry.getValue();
            if(maxim>max){
                max = maxim;
                originalIndex = index;
            }
        }
        return originalIndex;
    }
}