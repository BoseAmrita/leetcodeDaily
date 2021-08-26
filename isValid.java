/*------PROBLEM------*/
//Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/

/*------ALGORITHM------*/
//concept of stack
//convert string to character array to access element one by one.
//create a stack. If open paranthesis, insert into the stack.
//If closing paranthesis, compare each closing paranthesis to its opening one.
//If a match, take the pair out.


/*------SOLUTION------*/
class Solution {
    public boolean isValid(String s) {
      char[] chArr = s.toCharArray();
      Stack st = new Stack();
      
      for(Character c : chArr){
        if(c=='(' || c=='[' || c=='{') st.push(c);
        else{
          if(st.isEmpty()) return false;
          
          //type conversion of character to object to avoid error
          else if((st.peek() == (Object)'(' && c == ')') || (st.peek()==(Object)'[' && c==']')||(st.peek()==(Object)'{' && c=='}'))
            st.pop();
          else return false;
        }
      }
      if(st.isEmpty()) return true;
      return false;
    }
}
