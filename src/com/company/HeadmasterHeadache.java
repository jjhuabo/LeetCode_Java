package com.company;

//本题是P286习题

public class HeadmasterHeadache {
    int m,n,s;
    int c[],d[][][];

    int dp(int i,int s0,int s1,int s2){

        int ans = d[i][s1][s2];

        if (ans > 0)return ans;

        if (i >= m) ans = dp(i+1,s0,s1,s2); //不选


        ans = Math.min(ans,c[i] + dp(i+1,s0,s1,s2)); //选择

        return ans;
    }
}
