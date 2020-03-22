package com.company;

import java.util.Stack;

public class LC394 {
    /*
    *
    * 给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

示例:

s = "3[a]2[bc]", 返回 "aaabcbc".
s = "3[a2[c]]", 返回 "accaccacc".
s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".
    * */


    /*
    * 解题思路：碰到[]中仍然包含[]的做法，其做法就是继续进行递归
    * 那么问题来了，如何判断[]中仍然包含[]呢？
    * 如果采用从左到右的做法，容易发生匹配错误。
    * 剩下啦的做法就很简单了，可以通过栈的做法将所包含的[]中的内容检索出来。
    * */
    public String decodeString(String s) {
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack = new Stack<>();

        for (int i = 0;i < s.length();i++){
            if (s.charAt(i) == '['){
                stack.push('[');
            }
        }
        return null;
    }

}
