/**
 * Created by WZW on 2017/08/09.
 * 小易有一个圆心在坐标原点的圆，小易知道圆的半径的平方。小易认为在圆上的点而且横纵坐标都是整数的点是优雅的，小易现在想寻找一个算法计算出优雅的点的个数，请你来帮帮他。
 例如：半径的平方如果为25
 优雅的点就有：(+/-3, +/-4), (+/-4, +/-3), (0, +/-5) (+/-5, 0)，一共12个点。
 输入描述:
 输入为一个整数，即为圆半径的平方,范围在32位int范围内。
 输出描述:
 输出为一个整数，即为优雅的点的个数
 */
import java.util.*;
public class Main42{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int count=0;
            int n=in.nextInt();
            double a=Math.sqrt(n);
            for(int i=0;i<a;i++){
                double t=Math.sqrt(n-i*i);
                int t1=(int)t;
                if(t-(double)t1==0){
                    count++;
                }
            }
            System.out.println(count*4);
        }
    }
}