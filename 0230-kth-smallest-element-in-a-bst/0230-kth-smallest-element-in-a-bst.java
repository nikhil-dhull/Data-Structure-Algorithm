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
    public void fillinglist(TreeNode root,List<Integer> li){
        if(root==null) return;
        int val=root.val;
        li.add(val);
        fillinglist(root.left,li);
        fillinglist(root.right,li);
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null) return 0;
        List<Integer> li=new ArrayList<>();
        fillinglist(root,li);
        Collections.sort(li);
        return li.get(k-1);
    }
}