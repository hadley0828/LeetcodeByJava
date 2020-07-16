package com.hadley;

/*
2020.07.13
100、Same Tree
 */

public class _100 {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if((p != null && q == null)||( p == null && q !=null)||(p.val != q.val)) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}
