/*------PROBLEM------*/
//199. Binary Tree Right Side View
//https://leetcode.com/problems/binary-tree-right-side-view/

/*------ALGORITHM------*/
//Use preorder traversal, recursion
//Time Complexity: O(n)
//Space Complexity: O(level), where level = height of tree


/*------SOLUTION------*/
//Definition for Binary Tree Node
public class TreeNode{
  int val;
  TreeNode left, right;
  TreeNode(){}
  TreeNode(int val){this.val = val;}
  TreeNode(int val, TreeNode left, TreeNode right){
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution{
  public solve(TreeNode root, List<Integer> list, int level){
    if(root == null) return;
    if(level == list.size()) list.add(root.val);
    
    solve(root.right, list, level+1);
    solve(root.left, list, level+1);
  } 
  
  public List<Integer> rightSideView(TreeNode root){
    ArrayList<Integer> res = new ArrayList<Integer>();
    solve(root, res, 0);
    return res;
  }
}
