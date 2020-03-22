package com.company;

import java.util.Arrays;

public class LC945 {

    // 先排序
    // 然后进行统计

    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);

        int res = 0;
        int start = 0;
        for (int i = 1;i < A.length;i++){
            if (A[i] == A[i - 1]){
                res += Math.abs(A[i] - start) + 1;
                start = A[i] + 1;
            }
        }

        return res;
    }
}
