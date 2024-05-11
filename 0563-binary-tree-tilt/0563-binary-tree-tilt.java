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
    int sum;
    public int findTilt(TreeNode root) {
       
       if(root == null){
        return 0;
       }
       
       int left = helper(root.left);
       int right = helper(root.right);

       sum += Math.abs(left-right);

       findTilt(root.left);
       findTilt(root.right);
       return sum;
    }
    public int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        return root.val + helper(root.left) + helper(root.right);
    }
}