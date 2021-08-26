/*------PROBLEM------*/
//https://leetcode.com/problems/sum-of-square-numbers/

/*------ALGORITHM------*/
// Two pointer solution. 
//One keeps count of the first number, the other keeps count of the second number
//Space Complexity: O(1)
//Time Complexity: O(sqrt(c))


/*------SOLUTION------*/
class Solution{
  public boolean judgeSquareSum(int c){
    int a = 0;
    int b = (int)Math.sqrt(c);
    while(a<=b){
      int temp = a*a + b*b;
      if(temp == c) return true;
      else if(temp < c) a++;
      else b--;
    }
    return false;
  }
}
