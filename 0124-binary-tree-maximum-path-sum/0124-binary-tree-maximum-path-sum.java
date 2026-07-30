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
    int f(TreeNode root,int[] res){
        if(root==null)return 0;
        int left=Math.max(0,f(root.left,res));
        int right=Math.max(0,f(root.right,res));
        res[0]=Math.max(res[0],root.val+left+right);
        return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
        int[] res=new int[]{Integer.MIN_VALUE};
        f(root,res);
        return res[0];
    }
}