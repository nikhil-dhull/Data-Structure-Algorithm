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
 class Pair{
    TreeNode num;
    int idx;
    Pair(TreeNode num,int idx){
        this.num=num;
        this.idx=idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int maxwidth=0;
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int minIdx=q.peek().idx;
            int first=0;
            int last=0;
            for(int i=0;i<size;i++){
               Pair pair = q.poll();
                TreeNode node = pair.num;
                int curIdx = pair.idx - minIdx;
                if(i==0) first=curIdx;
                if(i==size-1) last=curIdx;
                if(node.left!=null) q.offer(new Pair(node.left,curIdx*2+1));
                if(node.right!=null) q.offer(new Pair(node.right,curIdx*2+2));
            }
            maxwidth=Math.max(maxwidth,last-first+1);
        }
        return maxwidth;
    }
}