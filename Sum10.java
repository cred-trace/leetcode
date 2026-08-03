class Solution {
    public int strStr(String haystack, String needle) {
        

        int haystack_len = haystack.length();
        int needle_len   = needle.length();
        int left_ptr  = 0;
        int right_ptr = 0;
        System.out.println(haystack_len);
        while ( right_ptr < haystack_len) {
            if (needle.charAt(left_ptr) != haystack.charAt(right_ptr) ){
                right_ptr = right_ptr - left_ptr +1;
                left_ptr = 0;
            }
            else if (needle.charAt(left_ptr) == haystack.charAt(right_ptr)){
                right_ptr++;
                left_ptr++;  
            }
            if (left_ptr == needle_len){
                int index = right_ptr - left_ptr;
                return index;
            }  
        }
    return -1;    
    }
}
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/2092592742/