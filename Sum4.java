class Solution {
    public void moveZeroes(int[] nums) {

    int left_pointer = 0;
    int  right_pointer = 1;
   for (int i=0; i< nums.length-1; i++){
    for (int j=i+1; j<nums.length; j++){
        if (nums[i]==0 && nums[j]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] =  temp;
        }
    }
   }
 System.out.print(Arrays.toString(nums));
     }
}
// https://leetcode.com/problems/move-zeroes/