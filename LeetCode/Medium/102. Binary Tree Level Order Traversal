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
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        
        if (root == null){
            return temp;
        }
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> temp1 = new ArrayList<Integer>();
            int val = queue.size();
            for(int x = 0; x < val; x++){
                
                TreeNode check = queue.poll();
                temp1.add(check.val);
                
                if (check.left != null){
                    queue.offer(check.left);
                }
                if (check.right != null){
                    queue.offer(check.right);
                }
            }
            
            temp.add(temp1);
            
        }
        
        return temp;
        
        
    }
}
