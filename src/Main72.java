/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。
 输入描述:
 输入数据一个字符串，包括字母,数字等。
 输出描述:
 输出首先出现三次的那个英文字符
 示例1
 输入

 Have you ever gone shopping and
 输出

 e
 */

import java.util.*;
public class Main72{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            char[] c=str.toCharArray();
            int num[]=new int[26+26];
            for(int i=0;i<c.length;i++){
                if(c[i]==' '){
                    continue;
                }
                if(c[i]>='a'&&c[i]<='z') {
                    num[(c[i] - 'a')]++;
                    if (num[(c[i] - 'a')] == 3) {
                        System.out.println(c[i]);
                        break;
                    }
                }else{
                    num[26+(c[i] - 'A')]++;
                    if (num[26+(c[i] - 'A')] == 3) {
                        System.out.println(c[i]);
                        break;
                    }
                }
            }
        }
    }
}