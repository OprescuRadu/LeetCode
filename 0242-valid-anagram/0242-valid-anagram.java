class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> charCounts1 = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(charCounts1.containsKey(s.charAt(i))){
                int a = charCounts1.get(s.charAt(i))+ 1;
                charCounts1.put(s.charAt(i),a);
            }
            else{
                charCounts1.put(s.charAt(i),1 );
            }
        }
        
        HashMap<Character, Integer> charCounts2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            int count = charCounts2.getOrDefault(c, 0);
            charCounts2.put(c, count + 1);
        }

        return charCounts1.equals(charCounts2);
    }
}