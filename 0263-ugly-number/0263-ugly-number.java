class Solution {
    public boolean isUgly(int n) {
        boolean isUgly = true;
        while (n % 2 == 0 && n >= 1){
            n = n/2;
        }
        while (n % 3 == 0 && n >= 1){
            n = n/3;
        }    
        while (n % 5 == 0 && n >= 1){
            n = n/5;   
        }
         if(n == 1){
            return true;
        }
        return false;
    }
}