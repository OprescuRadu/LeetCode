class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target < letters[0]){
            return letters[0];
        }
        if(target > letters[letters.length-1]){
            return letters[0];
        }
        int searched = binarySearch(letters, target);
        for(int i = searched; i < letters.length -1; i++ ){
            if(letters[i+1] != letters[i]){
                return letters[i+1];
            }
        }
       return letters[0]; 
    }
    
    public int binarySearch(char[] letters, char target){
        int left = 0;
        int right = letters.length-1;
        int middle = 0;
        while (left <= right){
            middle = (left + right)/2;
            if(target == letters[middle]){
                return middle;
            } else if(target < letters[ middle]){
                right = middle - 1;
            } else if (target > letters[middle]){
                left = middle + 1;
            } 
        }
            return right;
    }
}