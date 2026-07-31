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
public class Pair {
    int idx;
    TreeNode node;

    Pair(int idx, TreeNode node) {
        this.idx = idx;
        this.node = node;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<Pair>();
        q.offer(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            int idx=curr.idx;
            TreeNode node=curr.node;
             map.put(idx,node.val);
            if(node.left!=null) q.offer(new Pair(idx+1,node.left));
            if(node.right!=null) q.offer(new Pair(idx+1,node.right));
        }
        for (int i = 0; i < map.size(); i++) {
            res.add(map.get(i));
        }
        return res;
    }
}