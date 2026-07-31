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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        boolean ltor=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> subarr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode num=queue.poll();
                if (ltor)  subarr.addLast(num.val);
                else subarr.addFirst(num.val);
                
                if(num.left!=null){
                    queue.offer(num.left);
                }
                if(num.right!=null){
                    queue.offer(num.right);
                }
            }
            ltor=!ltor;
            res.add(subarr);
        }
        return res;
    }
}