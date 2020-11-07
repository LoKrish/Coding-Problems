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
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 */

public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null || nums.length==0)
            return null;
        
        return buildBinaryTree(nums,0,nums.length-1);
    }
    
    public static TreeNode buildBinaryTree(int[] nums,int low,int high){
        if(low>high)
            return null;
        
        int mid=(low+high)/2;
        TreeNode node=new TreeNode(nums[mid]);
        node.left=buildBinaryTree(nums,low,mid-1);
        node.right=buildBinaryTree(nums,mid+1,high);
        
        return node;      
    }
