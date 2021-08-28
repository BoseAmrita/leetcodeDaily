/*------PROBLEM------*/
//Given the root of a binary tree, return the sum of values of its deepest leaves.
//https://leetcode.com/problems/deepest-leaves-sum/

/*------ALGORITHM------*/
//We can solve this problem using both DFS and BFS travesal. I prefer using DFS because it has less space complexity. 


/*------SOLUTION------*/

//1. Using BFS.
//2. Use  the queue inorder to store the value of the node of Next Level.
//Every time we encounter a node, we put its left node and right node into the queue.
//For every level we start with sum 0 this makes sure that we will have the sum of node vaue of the deepest node only.
//Time Complexity: O(n)
//Space Complexity: O(n)
class Solution{
	public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return root.val;
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            sum = 0;
            for(int i = 0 ; i < count; i++){
                TreeNode curr = q.remove();
                sum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
        }
        
        return sum; 
    }
}

//2. Using DFS
//As we do for other DFS traversal we here also have two global variable one to keep track of the sum and another to keep track of the maximum depth.
//We start from the root and travel one node after another and when we see a node which is at a greater depth we update the MaxDepth and reset the answer. if the level is equal to the MaxDepth then we add the node.val to the answer.
//Finally we return the answer.
//Time Complexity: O(n)
//Space Complexity: O(1)
class Solution{
	int answer = 0;
    int maxDepth = -1;
    public int deepestLeavesSum(TreeNode root) {
        dfs(root,0);
        return answer;
    }
    
    public void dfs(TreeNode root,int level){
        if(root == null)
            return;
        if(maxDepth < level){
            maxDepth = level;
            answer = root.val;
        } else if(maxDepth == level){
            answer += root.val;
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}
