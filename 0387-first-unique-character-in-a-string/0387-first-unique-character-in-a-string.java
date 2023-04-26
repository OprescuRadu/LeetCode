class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hash = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
                hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i),0) + 1 );
            }
        for(int i = 0 ; i < s.length(); i++){
            if(hash.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}