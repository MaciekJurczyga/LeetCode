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
    public int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        size(root);  
        return ans;
    }
    public int size(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = size(root.left);
        int right = size(root.right);
        ans = Math.max(ans, left+right);
        return Math.max(left, right)+1;
    }
}