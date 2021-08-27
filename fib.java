/*------PROBLEM------*/
//Fibonacci Number
//https://leetcode.com/problems/fibonacci-number/

/*------ALGORITHM------*/
//Using Tabular Method
//store results in a table. So, no need to be calculated more than once.
//Time Complexity: O(n)


/*------SOLUTION------*/
public class Solution{
  public int fib(int n){
    //assuming n can accept only positive numbers
    if(n<=1) return n;
    int[] arr = new int[n+1];
    arr[0] = 0;
    arr[1] = 1;
    for(int i=2; i<=n; i++){
      arr[i] = arr[i-2]+arr[i-1];
    }
    return arr[n];
  }
}
