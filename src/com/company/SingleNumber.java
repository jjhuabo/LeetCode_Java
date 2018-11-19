package com.company;

import java.awt.*;
import java.util.*;

/*
给定一个非空  的整数数组，除了一个元素外，每个元素都会出现两次。找到那一个。
您的算法应具有线性运行时复杂性。你能不用额外的内存来实现吗？
例1：

输入： [2,2,1]
 输出： 1
 */
public class SingleNumber {
    public int singleNumber(int[] nums)
    {
        Set<Integer>hashset = new HashSet<Integer>();
        for (int num:nums)
        {
            if (hashset.contains(num)){
                hashset.remove(num);
            }
            else {
                hashset.add(num);
            }
        }

        //as hashset will have only one element left
        return hashset.iterator().next();
    }
}
