/**
 * Created by WZW on 2017/08/10.
 * 题目描述
 读入一个字符串str，输出字符串str中的连续最长的数字串
 输入描述:
 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
 输出描述:
 在一行内输出str中里连续最长的数字串。
 示例1
 输入

 abcd12345ed125ss123456789
 输出

 123456789
 */
import java.util.*;
public class Main53{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char[] c=str.toCharArray();
        int maxcount=Integer.MIN_VALUE;
        char bestc[]=new char[c.length];
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]>='0'&&c[i]<='9'){
                count++;
            }else{
                if(count!=0){
                    if(maxcount<count){
                        maxcount=count;
                        for(int j=0;j<maxcount;j++){
                            bestc[j]=c[i-maxcount+j];
                        }
                    }
                    count=0;
                }
            }
        }
        if(count!=0){
            if(maxcount<count){
                maxcount=count;
                for(int j=0;j<maxcount;j++){
                    bestc[j]=c[c.length-maxcount+j];
                }
            }
        }
        if(maxcount!=Integer.MIN_VALUE){
            for(int i=0;i<maxcount;i++){
                System.out.print(bestc[i]);
            }
        }
    }
}