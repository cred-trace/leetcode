class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int leftDivisor = 1;

        while (x / leftDivisor >= 10) {
            leftDivisor = leftDivisor * 10;
        }

        int rightDiv = 1;

        while (leftDivisor > rightDiv) {
            int leftDigit = (x / leftDivisor) % 10;
            int rightDigit = (x / rightDiv) % 10;
            if (leftDigit != rightDigit) {
                return false;
            }

            leftDivisor = leftDivisor / 10;
            rightDiv = rightDiv* 10;
        }

        return true;
    }
}
// https://leetcode.com/problems/palindrome-number/