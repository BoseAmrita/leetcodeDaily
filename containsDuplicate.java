/*------PROBLEM------*/
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//https://leetcode.com/problems/contains-duplicate/

/*------ALGORITHM------*/
//sort the array and traverse through it to find duplicates
//Time Complexity: O(nlogn)


/*------SOLUTION------*/
class Solution{
  public boolean containsDuplicate(int[] nums){
    Arrays.sort(nums);          //import package to sort array
    for(int i = 0; i < nums.length - 1; i++){
      if(nums[i] == nums[i+1] return true;      //checking equality
    }
    return false;               //when no duplicate found
  } 
}
