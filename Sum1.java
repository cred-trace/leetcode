class Solution {
    public int maximumProduct(int[] nums) {


        int FirstHigh  = Integer.MIN_VALUE;
        int SecondHigh = Integer.MIN_VALUE;
        int ThirdHigh  = Integer.MIN_VALUE;
        int FirstLow   = Integer.MAX_VALUE;
        int SecondLow  = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++){
            if ( nums [i] > FirstHigh ){
                ThirdHigh  = SecondHigh;
                SecondHigh = FirstHigh;
                FirstHigh  = nums[i];
            }
            else if ( nums [i] > SecondHigh ){
                ThirdHigh  = SecondHigh;
                SecondHigh = nums[i];
            } 
            else if ( nums [i] > ThirdHigh ){
                ThirdHigh = nums[i];
            } 
            if ( nums[i] < FirstLow){
                SecondLow = FirstLow;
                FirstLow  = nums[i];
            }
            else if (nums[i] < SecondLow){
                SecondLow = nums[i];
            }
        }
        int PositiveResult =  FirstHigh * SecondHigh * ThirdHigh ;
        int NegativeResult = FirstHigh * FirstLow * SecondLow;

        return (PositiveResult > NegativeResult) ? PositiveResult : NegativeResult;

    }
}

// https://leetcode.com/problems/maximum-product-of-three-numbers/description/ problem - link