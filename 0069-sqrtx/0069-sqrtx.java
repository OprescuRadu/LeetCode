class Solution {
    public int mySqrt(int x) {
        int res = 1;
        if (x == 0){
            return 0;
        }
        if  (x == 1){
            return 1; 
        }
        long L = 0;
        long R = x/2;
        long M = 1;
        while (R >= L){
            M = (R + L)/2;
            long aux = M * M;
            if(aux <x){
                res = (int) M;
            }
            if(aux < x){
                L = M +1;
            }
            else if(aux == x){
                return (int) M;
            }
            else {
                R = M -1;
            }
        }
    return res;
    }
}