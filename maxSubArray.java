/*------PROBLEM------*/
//Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//A subarray is a contiguous part of an array.
//https://leetcode.com/problems/maximum-subarray/

/*-------ALGORITHM------*/
//Use a sum to save the last result. 
//If the answer is less than 0. So adding the next number is meaningless as negative number plus any number is less than that number.
//We traverse the array once to get result.


/*------SOLUTION------*/
class Solution{
  public int maxSubArray(int[] nums){
    int sum = nums[0]; 
    int result = 0;
    
    //traverse array
    for(int num : nums){
      if(result > 0) result+= num;
      else result = num;          //get new result
    }
    
    //save maximum
    sum = Math.max(sum, result);
  }
  return sum;
}
