/**
 * Created by WZW on 2017/08/10.
 * 题目描述
 输入n个整数，输出出现次数大于等于数组长度一半的数。
 输入描述:
 每个测试输入包含 n个空格分割的n个整数，n不超过100，其中有一个整数出现次数大于等于n/2。
 输出描述:
 输出出现次数大于等于n/2的数。
 示例1
 输入

 3 9 3 2 5 6 7 3 2 3 3 3
 输出

 3
 */
import java.util.*;
public class Main55{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String s[]=str.split(" ");
        int a[]=new int[s.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        Arrays.sort(a);
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                count++;
            }else{
                if(count!=0){
                    if(count>=a.length/2){
                        System.out.println(a[i-1]);
                        return;
                    }
                }
                count=1;
            }
        }
    }
}
