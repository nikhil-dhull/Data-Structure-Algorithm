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
    private int preIndex=0;
    public TreeNode construct(int[] preorder,int[] inorder,int start,int end){
        if(start>end) return null;
        TreeNode root=new TreeNode(preorder[preIndex++]);
        if(start==end) return root;
        int pos=start;
        for(int i=start;i<=end;i++){
            if(inorder[i]==root.val){
                pos=i;
                break;
            }
        }
        root.left=construct(preorder,inorder,start,pos-1);
        root.right=construct(preorder,inorder,pos+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder==null || inorder==null || preorder.length==0) return null;
        preIndex=0;
        return construct(preorder,inorder,preIndex,inorder.length-1);
    }
}