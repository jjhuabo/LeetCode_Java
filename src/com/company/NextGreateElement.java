package com.company;

/*
你有两个数组（没有重复） nums1，nums2其中nums1的元素是子集nums2。
找到nums1相应位置的所有下一个更大的数字nums2。

一个号码的下更大数量的X中nums1是其在右侧的第一个较大的数目nums2。如果它不存在，则为此数字输出-1。
 */

//分析：这个题目也很明显，就是考察基本的数据结构的应用
//因为nums1 是 nums2的子集，也就是说nums1中的每个元素都会在nums2中出现
//所以这里可以采取一种策略就是利用队列将nums2中的每个元素排列好。并同时利用map存储好
//对应的索引，这样在后续查询的时候就是0(1)的复杂度。

import java.util.*;

public class NextGreateElement {

    public int [] nextGreaterElement(int [] nums1,int[] nums2)
    {
        Map<Integer,Integer>map = new HashMap<>();
        int[] result = new int[nums1.length];
        Deque<Integer>stack = new ArrayDeque<>();

        for (int num2 : nums2)
        {
            while (!stack.isEmpty() && stack.peek() < num2)
            {
                map.put(stack.removeFirst(),num2);
            }

            stack.addFirst(num2);
        }

        for (int i = 0;i < nums1.length;i++)
        {
            result[i] = map.getOrDefault(nums1[i],-1);
        }

        return result;
    }
}
