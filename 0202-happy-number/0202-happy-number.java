class Solution {
    public boolean isHappy(int n) {
        List<Integer> myList = new ArrayList<>();
        int sum = 0;
        while(n != 1){
            myList.add(n);
            sum = 0;
            int nCopy = n;
            while(nCopy >0 ){
                int digit = nCopy % 10;
                sum = sum + digit * digit;
                nCopy/=10;
            }
        if(sum == 2 || sum == 3 || sum == 4 || sum ==5  || sum == 6 || sum == 8 || sum == 9){
            return false;
        }
        n = sum;
        }
        return true;
    }
    
}