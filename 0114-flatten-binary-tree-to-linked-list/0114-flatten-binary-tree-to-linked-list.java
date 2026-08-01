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
    
    public void f(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        list.add(root);
        f(root.left,list);
        f(root.right,list);
    } 
    public void flatten(TreeNode root) {
        if(root==null) return;
       List<TreeNode> list=new ArrayList<>();
        f(root,list);
        for(int i=0;i<list.size()-1;i++){
            TreeNode curr=list.get(i);
            curr.left=null;
            curr.right=list.get(i+1);
        }
        TreeNode last= list.get(list.size()-1);
        last.right=null;
        last.left=null;

    }
}