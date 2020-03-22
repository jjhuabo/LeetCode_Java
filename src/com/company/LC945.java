package com.company;

import java.util.Arrays;

public class LC945 {

    // 先排序
    // 然后进行统计

    public int minIncrementForUnique(int[] A) {
        if(A.length == 0)
            return 0;
        Arrays.sort(A);

        int res = 0;
        int start = A[0];
        for (int i = 1;i < A.length;i++){
            if (A[i] <= start){
                res += start - A[i] + 1;
                A[i] = start + 1;
            }

            start = Math.max(start,A[i]);
        }

        return res;
    }
}
