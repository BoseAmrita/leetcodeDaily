/*-------ABOUT THE PROBLEM--------*/
        //Verify Preorder Serialization of a Binary Tree
        //https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/


/*-------ALGORITHM-------*/
        // using a stack, scan left to right
        // case 1: we see a number, just push it to the stack
        // case 2: we see #, check if the top of stack is also #
        // if so, pop #, pop the number in a while loop, until top of stack is not #
        // if not, push it to stack
        // in the end, check if stack size is 1, and stack top is #
        //Time Complexity: O(n)
        //Space Complexity: O(n)
 

/*-----SOLUTION-----*/
class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder == null) return false;
        String[] strs = preorder.split(",");
        Stack st = new Stack();
        for(int i=0; i<strs.length; i++){
            while(strs[i].equals("#") && !st.isEmpty() && st.peek().equals(strs[i])){
                st.pop();
                if(st.isEmpty())
                    return false;
                st.pop();
            }
            st.push(strs[i]);
        }
        return st.size()==1 && st.peek().equals("#");
    }
}
