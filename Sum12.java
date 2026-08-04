class Solution {
    public int lengthOfLastWord(String s) {

    int count = 0;   
    char prev_char = '\0' ; 
    for (int i=0; i<s.length();i++){
        if (s.charAt(i) != ' '){
           count++; 
        }
        if (prev_char == ' ' && s.charAt(i) != ' '){
            count = 1;
            prev_char = s.charAt(i); 

        }
        else if (s.charAt(i) == ' ') {
           prev_char = s.charAt(i); 
        }
     }
    return count; 

    }
}
// https://leetcode.com/problems/length-of-last-word/ 4 aug