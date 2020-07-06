package com.hadley;

/*
2020.07.02
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _102 {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    //can use last and Nlast to control the output of every line
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> list = new ArrayList<>();
            while(count > 0){
                TreeNode temp = q.peek();
                q.poll();
                list.add(temp.val);
                if(temp.left != null) q.add(temp.left);
                if(temp.right != null) q.add(temp.right);
                count--;
            }
            res.add(list);
        }
        List<List<Integer>> reverseRes = new ArrayList<>();
        for(int i = res.size() - 1; i >= 0; i--){
            reverseRes.add(res.get(i));
        }
        return reverseRes;
    }
}
