class Solution {
    public int removeDuplicates(int[] nums) {
    
    int left = 0;
    int right = 1;
    int k = 1;
    while (right < nums.length){
        if (nums[left] != nums[right]){
          left++;
          nums[left] = nums[right];
          k++;
        }
        right ++ ;
    }
return k;
    }
}
// problem- 1, 30-july
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/