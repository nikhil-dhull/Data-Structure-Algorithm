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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> li=new ArrayList<List<Integer>>();
        if(root==null) return li;;
        queue.offer(root);
        while(!queue.isEmpty()){
            int num=queue.size();
            List<Integer> sublist=new ArrayList<>();
            for(int i=0;i<num;i++){
                TreeNode curr=queue.poll();
                sublist.add(curr.val);
                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }
            li.add(sublist);
        }
        return li;
    }
}