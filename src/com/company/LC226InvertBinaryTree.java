package com.company;

/*
反转二叉树。

例：

输入：

     4
   /   \
  2     7
 / \   / \
1   3 6   9
输出：

     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */

//思路：1 将二叉树排列成链表 2 反向 3 转换成二叉树
//并不需要这样复杂，通过

public class LC226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root)
    {
        if (root!=null){
            if (root.left != null)
                invertTree(root.left);
            if (root.right != null)
                invertTree(root.right);

            //swap
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;

        }

        return root;
    }
}
