class Solution {
    public int distributeCandies(int[] candyType) {
        int maxCandies = candyType.length / 2;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < candyType.length; i++){
            set.add(candyType[i]);
        }
        if(set.size() <= maxCandies){
            return set.size();
        }
        else {
            return maxCandies;
        }
    }
}