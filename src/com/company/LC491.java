package com.company;

import java.util.*;

public class LC491 {

    /*
    *
    * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是2。

    示例:

    输入: [4, 6, 7, 7]
    输出: [[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]]
    * */

    /*
    * 思路：通过dfs进行枚举
    * 不能对其进行排序，也就是说不能够打破原先的排列顺序
    *
    * */

    public List<List<Integer>> findSubsequences(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0;i < nums.length;i++){
            dfs(nums,i,new ArrayList<>(),set);
        }

        return res;
    }

    public void dfs(int[] nums, int i, List<Integer>cur,Set<List<Integer>>set){
        if (cur.size() >= 2){
            set.add(new ArrayList<>(cur));
        }

        for (int j = i;j < nums.length;j++){

            // 由于是要递增的顺序，所以必须要通过cur.get(cur.size()-1)与当前选中的nums[j]
            // 进行判断以决定是否将nums[j]加入cur中。
            if(cur.size() == 0 || cur.get(cur.size()-1) <= nums[j]){
                cur.add(nums[j]);
                dfs(nums,j+1,cur,set);
                cur.remove(cur.size()-1);
            }
        }
    }
}
