/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 一只袋鼠要从河这边跳到河对岸，河很宽，但是河中间打了很多桩子，每隔一米就有一个，每个桩子上都有一个弹簧，袋鼠跳到弹簧上就可以跳的更远。每个弹簧力量不同，用一个数字代表它的力量，如果弹簧力量为5，就代表袋鼠下一跳最多能够跳5米，如果为0，就会陷进去无法继续跳跃。河流一共N米宽，袋鼠初始位置就在第一个弹簧上面，要跳到最后一个弹簧之后就算过河了，给定每个弹簧的力量，求袋鼠最少需要多少跳能够到达对岸。如果无法到达输出-1
 输入描述:
 输入分两行，第一行是数组长度N (1 ≤ N ≤ 10000)，第二行是每一项的值，用空格分隔。
 输出描述:
 输出最少的跳数，无法到达输出-1
 示例1
 输入

 5
 2 0 1 1 1
 输出

 4
 */
import java.util.*;
public class Main75{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        int d[]=new int[n+1];
        d[0]=1;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                continue;
            }
            for(int j=1;j<=a[i];j++){
                if(i+j>n){
                    break;
                }

                if(d[i+j]==0){
                    d[i+j]=d[i]+1;
                }else{
                    d[i+j]=Math.min(d[i+j],d[i]+1);
                }
            }
        }
        System.out.println(d[n]-1);
    }
}
//public class Main75 {
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] t = new int[n];
//        int [] s = new int[n+1];
//        for(int i = 0 ; i<n ; i++){
//            t[i] = sc.nextInt() ;
//        }
//        s[0] = 1;
//        for(int i = 0 ; i<n ; i++){
//            if(t[i]>0&&s[i]>0){
//                for(int j = 1; j<=t[i] ; j++){
//                    if(i+j>n)break;
//                    if(s[i+j] == 0){
//                        s[i+j] = s[i]+1;
//                    }else{
//                        s[i+j] = Math.min(s[i+j], s[i]+1);
//                    }
//                }
//            }
//        }
//        System.out.println(s[n]-1);
//    }
//}