/*------PROBLEM------*/
//Given a string s, find the length of the longest substring without repeating characters.
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

/*------ALGORITHM------*/
//Use Hashset and concept of shrinking window, 2 pointers
//Time Complexity: O(n)


/*------SOLUTION------*/
class Solution{
  public int lengthOfLongestSubstring(String s){
    HashSet set = new HashSet();
    int low = 0, length = 0;
    for(int high = 0; high < s.length(); high++){
      char currChar = s.charAt(high);              
      while(set.contains(currChar))               // shrink the window as long as we have a repeated character
        set.remove(s.charAt(low++));
      
      set.add(currChar);
      
      length = Math.max(length, high - low + 1);
    }
    return length;
  }
}
