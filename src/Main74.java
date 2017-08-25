/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 有一条彩色宝石项链，是由很多种不同的宝石组成的，包括红宝石，蓝宝石，钻石，翡翠，珍珠等。有一天国王把项链赏赐给了一个学者，并跟他说，你可以带走这条项链，但是王后很喜欢红宝石，蓝宝石，紫水晶，翡翠和钻石这五种，我要你从项链中截取连续的一小段还给我，这一段中必须包含所有的这五种宝石，剩下的部分你可以带走。如果无法找到则一个也无法带走。请帮助学者找出如何切分项链才能够拿到最多的宝石。
 输入描述:
 我们用每种字符代表一种宝石，A表示红宝石，B表示蓝宝石，C代表紫水晶，D代表翡翠，E代表钻石，F代表玉石，G代表玻璃等等，我们用一个全部为大写字母的字符序列表示项链的宝石序列，注意项链是首尾相接的。每行代表一种情况。
 输出描述:
 输出学者能够拿到的最多的宝石数量。每行一个
 示例1
 输入

 ABCYDYE
 ATTMBQECPD
 输出

 1
 3
 */
import java.util.*;
public class Main74{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        char c[]=str.toCharArray();
        int max=Integer.MIN_VALUE;
        for(int i=1;i<c.length;i++){
            for(int j=i+1;j<c.length;j++){
                int n=charge(c,i,j);
                max=Math.max(n,max);
            }
        }
        System.out.println(max);
    }
    public static int charge(char c[],int f,int s){
        boolean flags[]=new boolean[5];
        for(int i=0;i<f;i++){
            switch(c[i]){
                case 'A':flags[0]=true;break;
                case 'B':flags[1]=true;break;
                case 'C':flags[2]=true;break;
                case 'D':flags[3]=true;break;
                case 'E':flags[4]=true;break;
            }
        }
        for(int i=s;i<c.length;i++){
            switch(c[i]){
                case 'A':flags[0]=true;break;
                case 'B':flags[1]=true;break;
                case 'C':flags[2]=true;break;
                case 'D':flags[3]=true;break;
                case 'E':flags[4]=true;break;
            }
        }
        boolean flag1=true;
        for(int i=0;i<flags.length;i++){
            if(!flags[i]){
                flag1=false;
            }
            flags[i]=false;
        }
        for(int i=f;i<s;i++){
            switch(c[i]){
                case 'A':flags[0]=true;break;
                case 'B':flags[1]=true;break;
                case 'C':flags[2]=true;break;
                case 'D':flags[3]=true;break;
                case 'E':flags[4]=true;break;
            }
        }
        boolean flag2=true;
        for(int i=0;i<flags.length;i++){
            if(!flags[i]){
                flag2=false;
            }
        }
        int a1=f+c.length-s;
        int a2=s-f;
        if(flag1&&flag2){
            return Math.max(a1,a2);
        }else if(flag1&&!flag2){
            return a2;
        }else if(!flag1&&flag2){
            return a1;
        }else{
            return -1;
        }


    }
}