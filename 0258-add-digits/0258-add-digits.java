class Solution {
    public int addDigits(int num) {
        int sum = 0;
        if (num <= 9) {
            return num;
        } else {
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
        }
        num = sum;
        return addDigits(num);
    }
}