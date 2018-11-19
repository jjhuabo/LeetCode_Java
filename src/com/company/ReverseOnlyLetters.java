package com.company;
import java.lang.String;
import java.util.*;
import java.lang.Iterable;
/*
给定一个字符串S，返回“反向”字符串，其中所有非字母的字符都保留在同一位置，并且所有字母都反转其位置。
 */
//分析：最主要的问题就是将非字符串的位置记录下来。
//接下来的问题就是如何按照题中的规则对其进行排列
//本题还是利用到了数据结构的知识，解题的关键还是数据结构的熟练程度
//非字符串的记录有两个要点：1 记录位置 @ 记录非字符串种类
//思路：这些题目的本质就是考察数据结构的利用

public class ReverseOnlyLetters {
    public String reverseOnlyLetters(String S)
    {
        LinkedList<Character>ls = new LinkedList<>();
        for (int i = 0;i < S.length();i++)
        {
            if (isLetter(S.charAt(i)))
            {
                ls.add(S.charAt(i));
            }
        }

        StringBuffer result = new StringBuffer();
        for (int i = 0;i < S.length();i++)
        {
            if (isLetter(S.charAt(i)))
            {
                result.append(ls.removeLast());
            }
            else
            {
                result.append(S.charAt(i));
            }
        }

        return result.toString();
    }

    private boolean isLetter(char c)
    {
        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
    }

}
