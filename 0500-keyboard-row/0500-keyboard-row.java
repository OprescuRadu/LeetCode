class Solution {
    public String[] findWords(String[] words) {
        int j = 0;
        String[] found = new String[words.length];
        for(int i = 0; i < words.length; i++){
            if(checkFirstRow(words[i]) || checkSecondRow(words[i]) ||                                    checkThirdRow(words[i])){
                found[j] = words[i];
                j++;
            }
                           
    }
        return found = Arrays.copyOf(found,j);  
}
    
    
    public boolean checkFirstRow(String word) {
            String firstRow = "qwertyuiop";
             word = word.toLowerCase();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < firstRow.length(); j++) {
                        if (word.charAt(i) == firstRow.charAt(j)) {
                                count++;
                                break;
                        }
                }
            }
            return count == word.length();
    }

    public boolean checkSecondRow(String word) {
            String firstRow = "asdfghjkl";
             word = word.toLowerCase();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < firstRow.length(); j++) {
                        if (word.charAt(i) == firstRow.charAt(j)) {
                                count++;
                                break;
                        }
                }
            }
            return count == word.length();
        }


    public boolean checkThirdRow(String word) {
            String firstRow = "zxcvbnm";
            word = word.toLowerCase();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                for (int j = 0; j < firstRow.length(); j++) {
                        if (word.charAt(i) == firstRow.charAt(j)) {
                                count++;
                                break;
                        }
                }
            }
            return count == word.length();
        }
}