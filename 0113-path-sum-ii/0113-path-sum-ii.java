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
    public void f(TreeNode root,int targetSum,List<List<Integer>> res,int sum,List<Integer> path){
        if(root==null) return;
        path.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
        if(sum==targetSum) {
            res.add(new ArrayList<>(path));   
        }
    }
        else{
        f(root.left,targetSum,res,sum,path);
        f(root.right,targetSum,res,sum,path);
        }
        path.remove(path.size()-1);
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        int sum=0;
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        f(root,targetSum,res,sum,path);
        return res;
    }
}