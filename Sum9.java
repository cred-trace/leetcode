class Solution {
    public int[] plusOne(int[] digits) {

        int len = digits.length - 1;

        if (digits[len] != 9) {
            digits[len]= digits[len] +1;
            return digits;
        }

        for (int i = len; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]= digits[i]+1;
                return digits;
            }
        }

        int[] new_digits = new int[digits.length + 1];
        new_digits[0] = 1;

        return new_digits;
    }
}
// https://leetcode.com/problems/plus-one/   // problem- 1, 3-aug