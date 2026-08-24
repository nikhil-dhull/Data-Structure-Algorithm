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
    static int preIdx=0;
    public TreeNode solve(int[] preorder,int[] postorder,int l,int r){
        if(l>r || preIdx>=preorder.length) return null;
        TreeNode root=new TreeNode(preorder[preIdx++]);
        if(l==r) return root;
        int idx=l;
        int leftroot=preorder[preIdx];
        while(postorder[idx]!=leftroot){
            idx++;
        }
        root.left=solve(preorder,postorder,l,idx);
        root.right=solve(preorder,postorder,idx+1,r-1);
        return root;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        preIdx=0;
        return solve(preorder,postorder,0,preorder.length-1);
    }
}