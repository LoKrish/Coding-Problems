/**
	Given two binary trees and imagine that when you put one of them 
    to cover the other, some nodes of the two trees are overlapped 
    while the others are not.
*/
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null)
            return null;
        else if(t1==null)
            return t2;
        else if(t2==null)
            return t1;
  
        TreeNode merged=new TreeNode(t1.val+t2.val);
        merged.left=mergeTrees(t1.left,t2.left);
        merged.right=mergeTrees(t1.right,t2.right);
  
        return merged;
}
