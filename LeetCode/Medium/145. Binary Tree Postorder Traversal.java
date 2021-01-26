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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> a1 = new ArrayList<Integer>();
        
        if (root == null){
            return a1;
        }
        
        a1 = postorder(root, a1);
        
        return a1;
    }
    
    public static List<Integer> postorder(TreeNode root, List<Integer> temp1){
        
        if(root.left != null){
            postorder(root.left, temp1);
        }        
        if (root.right != null){
            postorder(root.right, temp1);
        }
        
        temp1.add(root.val);
        
        return temp1;
    }
}
