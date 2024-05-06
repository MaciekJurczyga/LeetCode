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
    int counter;
    public int countNodes(TreeNode root) {
        if(root == null){
            return 0;
        }
        Counter(root);
        return counter;
    }
    public int Counter(TreeNode root){
        if(root == null){
           return 0;

        }
        Counter(root.left);
        Counter(root.right);
        counter++;

    }
}