/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<>();
        
        preorderTraverse(root,res);
        return res;
    }
    public void preorderTraverse(TreeNode root, List<Integer> res ){
        if(root==null){
            return ;
        }
        res.add(root.val);
        preorderTraverse(root.left, res);
        preorderTraverse(root.right, res);
        
    }
}