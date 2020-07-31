package com.hadley;

/*
2020.07.23
103、Binary Tree Zigzag Level Order Traversal
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        // levelRecursion(root, result, 0, false);
        levelRecursion(root, result, 0,false);

        return result;
    }

    private void levelRecursion(TreeNode node, List<List<Integer>> result,
                                int level, boolean flag) {
        if (node == null) {
            return;
        }
        if (result.size() < level + 1) {// 说明还需要添加一行
            result.add(new LinkedList<Integer>());
        }
        if (flag) {
            ((LinkedList<Integer>) result.get(level)).addFirst(node.val);
        } else {
            result.get(level).add(node.val);
        }

        levelRecursion(node.left, result, level + 1, !flag);
        levelRecursion(node.right, result, level + 1, !flag);
    }
}
