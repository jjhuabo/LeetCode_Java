package com.company;

/*
给定非空二进制树，以数组的形式返回每个级别上的节点的平均值。
输入：
    3
   / \
  9 20
    / \
   15 7 输出： [3,14.5,11]
 说明：
0级节点的平均值为3,1级为14.5，级别2为11。因此返回[3] ，14.5,11]。
 */

//思路：这里的问题就是写出每个节点上的值
//      然后求解平均值
//      最后将平均值加入到数组中间
//看到这个问题应该尝试使用广度搜索

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LC637AverageofLevelinBinaryTree {

    public List<Double> averageOfLevels(TreeNode root)
    {
        List<Double>res = new ArrayList<>();
        Queue<TreeNode>stack = new LinkedList<>();

        stack.offer(root);

        while (!stack.isEmpty())
        {
            List<Integer>l = new ArrayList<>();
            Double avg = 0.0;

            int len = stack.size();

            for (int i = 0;i < len;i++)
            {
                TreeNode np = stack.poll();
                avg += np.val;

                if (np.left != null)
                {
                    stack.offer(np.left);
                }
                if (np.right != null)
                {
                    stack.offer(np.right);
                }
            }

            res.add(avg / len);
        }

        return res;
    }

    private int getNodeSum(TreeNode root)
    {
        int sum = 0;
        sum += root.left.val;
        sum += root.right.val;

        return sum;
    }

    private void getAverage(TreeNode root,List<Double>aveage)
    {
        int floor = 1;
        int sum = getNodeSum(root.right) + getNodeSum(root.left);
        floor = floor * 2;
        aveage.add((double)sum/floor);

        getAverage(root.left,aveage);
        getAverage(root.right,aveage);
    }
}
