class Solution {
    public boolean isPalindrome(String s) {
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println(cleaned);
        int left_ptr  = 0;
        int right_ptr = cleaned.length()-1;
        while (left_ptr <= right_ptr){
            if (cleaned.charAt(left_ptr) == cleaned.charAt(right_ptr)){
                left_ptr ++;
                right_ptr--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/valid-palindrome/submissions/2094031033/?envType=problem-list-v2&envId=oizxjoit