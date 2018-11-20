package com.company;

/*
计算两个整数a和b的总和，但不允许使用运算符+和-。
 */
//思路：不允许使用加减法，可以尝试使用二进制来处理这个问题。
// 左移一位相当于该数乘以2，左移2位相当于该数乘以2^2=4。上面举的例子15<< 2=60，即乘了4。
// 但此结论只适用于该数左移时被溢出舍弃的高位中不包含1的情况。
//唯一较为困难的就是处理进位的问题。

public class LC371SumofTwoIntegers {
    public int getSum(int a,int b)
    {
        int sum = 0;
        //carry 代表进位
        int carry = 0,aBit,bBit;

        for (int i = 0;i < 32;i++)
        {
            aBit = (a >>>i)&1;
            bBit = (b >>>i)&1;

            sum |= (aBit^bBit^carry)<<i;
            carry = (aBit & bBit)|(bBit&carry)|(aBit&carry);
        }

        return sum;
    }
}
