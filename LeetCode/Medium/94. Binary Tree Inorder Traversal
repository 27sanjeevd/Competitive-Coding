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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> a1 = new ArrayList<Integer>();
        
        if (root == null){
            return a1;
        }
        
        a1 = inorder(root, a1);
        
        return a1;
    }
    
    public static List<Integer> inorder(TreeNode root, List<Integer> temp1){
        
        if(root.left != null){
            inorder(root.left, temp1);
        }        
        temp1.add(root.val);
        if (root.right != null){
            inorder(root.right, temp1);
        }
        
        return temp1;
    }
}
