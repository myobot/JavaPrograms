/**
 * Created by WZW on 2017/08/10.
 * 题目描述
 找出n个数里最小的k个
 输入描述:
 每个测试输入包含空格分割的n+1个整数，最后一个整数为k值,n
 不超过100。
 输出描述:
 输出n个整数里最小的k个数。升序输出
 示例1
 输入

 3 9 6 8 -10 7 -11 19 30 12 23 5
 输出

 -11 -10 3 6 7
 */
import java.util.*;
public class Main54{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String n[]=str.split(" ");
        int k=Integer.parseInt(n[n.length-1]);
        int min[]=new int[k];
        for(int i=0;i<min.length;i++){
            min[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<n.length-1;i++){
            int a=Integer.parseInt(n[i]);
            for(int j=0;j<min.length;j++){
                if(min[j]>a){
                    for(int p=min.length-1;p>j;p--){
                        min[p]=min[p-1];
                    }
                    min[j]=a;
                    break;
                }
            }
        }
        for(int i=0;i<min.length;i++){
            if(i==min.length-1){
                System.out.print(min[i]);
            }else {
                System.out.print(min[i] + " ");
            }
        }
    }
}