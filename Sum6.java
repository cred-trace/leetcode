class Solution {
    public String longestCommonPrefix(String[] strs) {


    if (strs.length == 0 )
    {return "";}
    
    int low_char_of_str = strs[0].length();
    
     for (int i=1; i<strs.length; i++){
        if ( strs[i].length() < low_char_of_str ){
            low_char_of_str = strs[i].length();
        }
     }
    int left_pointer = 0;
    while ( left_pointer < low_char_of_str)
    {
        for (int i=1; i<strs.length; i++){
            char current_character = strs[0].charAt(left_pointer);
            if ( strs[i].charAt(left_pointer) != current_character)
            {
                return strs[0].substring(0, left_pointer);
            }
        }
        left_pointer ++;
    }
    return strs[0].substring(0, left_pointer);
    }
}
// https://leetcode.com/problems/longest-common-prefix/    (28-jul)