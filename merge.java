/*------PROBLEM------*/
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n.
//https://leetcode.com/problems/merge-sorted-array/

/*------ALGORITHM------*/
//Use concept of merge sort algorithm


/*------SOLUTION------*/
class Solution{
  public void merge(int[] nums1, int m, int[] nums2, int n){
    int[] sortedArr = new int[m+n];
    
    //initialize pointers for all the arrays
    int i=j=k=0;
    
    //check which element is small amidst the two arrays
    while(i<m && j<n){
      if(nums1[i] < nums2[j]){
        sortedArr[k] = nums1[i];
        i++; k++;
      }else{
        sortedArr[k] = nums2[j];
        j++; k++;
      }
    }
    
    //to copy the remaining elements
    while(i<m){
      sortedArr[k] = nums1[i];
      i++; k++;
    }
    while(j<n){
      sortedArr[k] = nums2[j];
      j++; k++;
    }
    
    //copy elements from sortedArr back to nums1
    for(int i=0; i<m+n; i++){
      nums1[i] = sortedArr[i];
    }
  }
}
