/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
 输入描述:
 输入为两行内容，第一行是正整数number，1 ≤ length(number) ≤ 1000。第二行是希望去掉的数字数量cnt 1 ≤ cnt < length(number)。
 输出描述:
 输出保留下来的结果。
 示例1
 输入

 325
 1
 输出

 35
 */
import java.util.*;
public class Main73 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char c[] = s.toCharArray();
        int n = in.nextInt();
        int maxindex = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
                maxindex = i;
            }
        }
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE - 1;
            int minindex = 0;
            if (n > maxindex) {
                for (int j = 0; j < c.length; j++) {
                    if (c[j] == ' ') {
                        continue;
                    } else {
                        if (c[j] < min) {
                            min = (int) c[j];
                            minindex = j;
                        }
                    }
                }
            } else {
                for (int j = 0; j < maxindex; j++) {
                    if (c[j] == ' ') {
                        continue;
                    } else {
                        if (c[j] < min) {
                            min = (int) c[j];
                            minindex = j;
                        }
                    }
                }
            }
            c[minindex] = ' ';
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') {
                continue;
            } else {
                System.out.print(c[i]);
            }
        }
    }
}