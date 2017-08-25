/**
 * Created by WZW on 2017/08/09.
 * 题目描述
 Fibonacci数列是这样定义的：
 F[0] = 0
 F[1] = 1
 for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 输入描述:
 输入为一个正整数N(1 ≤ N ≤ 1,000,000)
 输出描述:
 输出一个最小的步数变为Fibonacci数"
 */
import java.util.*;
public class Main38{
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        int a=0;
        int b=1;
        int temp=a+b;
        list.add(a);
        list.add(b);
        list.add(temp);
        while(temp<=1000001){
            a=b;
            b=temp;
            temp=a+b;
            list.add(temp);
        }
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int index=-1;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i+1)>n){
                index=i;
                break;
            }
        }
        int ans;
        if(index==-1){
            ans=n-list.get(list.size()-1);
        }else{
            ans=Math.min(n-list.get(index),list.get(index+1)-n);
        }
        System.out.println(ans);
    }
}