package com.company;
import java.lang.String;

/*
你会得到J代表珠宝类型的字符串，S代表你拥有的宝石。每个角色S都是你拥有的一种石头。你想知道你有多少宝石也是珠宝。

在这些信件J是保证不同，而在所有的字符J和S是字母。字母区分大小写，因此"a"被认为是不同类型的石头"A"。
 */

//思路1：本题就是可以使用粗暴的解决方案，就是遍历每一个字符
//思路2：可以先将J代表的珠宝的集合处理一下，将字符与索引结合起来。

public class LC771JewelsandStones {
    public int numJewelsInStones(String J,String S){
        int jewelsNumb = 0;

        for (int i = 0;i < S.length();i++){

            for (int j = 0;j < J.length();j++){
                if (S.charAt(i) == J.charAt(j)){
                    jewelsNumb++;
                }
            }
        }

        return jewelsNumb;
    }

    public int numJewelsInStones1(String J,String S){
        int [] jewelsColl = new int[123];
        int numb = 0;

        for (int i = 0;i < J.length();i++){
            jewelsColl[J.charAt(i)] = 1;
        }

        for (int j = 0;j < S.length();j++){
            if (jewelsColl[S.charAt(j)] == 1){
                numb++;
            }
        }

        return numb;
    }
}
