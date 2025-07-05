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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(root, targetSum, new ArrayList<>(), result);

        return result;
    }

    public void backtrack(TreeNode root, int remSum, List<Integer> currPath, List<List<Integer>> result) {

        if(root == null) {
            return;
        }

        currPath.add(root.val);
        remSum -= root.val;

        // check if it's a leaf and the sum matches
        if(root.left == null && root.right == null && remSum == 0) {
            result.add(new ArrayList<>(currPath));
        } else {
            backtrack(root.left, remSum, currPath, result);
            backtrack(root.right, remSum, currPath, result);
        }

        // backtrack step
        currPath.remove(currPath.size()-1);
    }
} 