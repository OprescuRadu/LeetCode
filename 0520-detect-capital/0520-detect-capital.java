class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.toLowerCase().equals(word)){
            return true;
        }
        if(word.toUpperCase().equals(word)){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))){
            StringBuilder sb = new StringBuilder (word);
            sb.deleteCharAt(0);
            String toBeChecked = sb.toString();
            return toBeChecked.toLowerCase().equals(toBeChecked);
        }
    return false;
    }
}