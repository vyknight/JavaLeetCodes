import java.util.Arrays;

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
//class SortedArrayToBST {
//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums.length == 0) {
//            TreeNode newNode = new TreeNode();
//            return newNode;
//        } else if (nums.length == 1) {
//            TreeNode newNode = new TreeNode(nums[0]);
//            return newNode;
//        }
//        else {
//            int[] left = Arrays.copyOfRange(nums, 0, nums.length / 2);
//            int node = nums[nums.length / 2];
//            int[] right = Arrays.copyOfRange(nums, (nums.length / 2) + 1, nums.length - 1);
//            TreeNode leftTree = sortedArrayToBST(left);
//            TreeNode rightTree = sortedArrayToBST(right);
//            TreeNode newNode = new TreeNode(node, leftTree, rightTree);
//            return newNode;
//            }
//        }
//    }
//}