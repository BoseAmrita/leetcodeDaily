/*------PROBLEM------*/
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//https://leetcode.com/problems/two-sum/

/*------ALGORITHM------*/
//Two pointers to keep check of the two indices. Brute Force Method
//Time Complexity: O(n)


/*------SOLUTION------*/
class Solution{
  public int[] twoSum(int[] nums, int target){
    int[] res = new int[2];
    for(int i=0; i<nums.length; i++){
      for(int j = i+1; j < nums.length; j++){
        if(nums[i] + nums[j] == target){        //check condition
          //assign values to resulting array
          res[0] = nums[i];                     
          res[1] = nums[j];
        }
      }
      return res;
    }
  }
}
