/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
 输入描述:
 输入为一个数字N，即需要拼凑的面额
 输出描述:
 输出也是一个数字，为组成N的组合个数。
 示例1
 输入

 5
 输出

 2
 */
import java.util.*;
public class Main66{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(countWays(n));
        }
        sc.close();
    }

    public static long countWays(int n) {
        int[] w = new int[]{0, 1, 5, 10, 20, 50, 100};
        long[][] dp = new long[w.length][n + 1];
        for (int j = 1; j <= n; j++)       //0个硬币兑换成j分的方法数设置为0
            dp[0][j] = 0;
        for (int j = 0; j < w.length; j++) //j个硬币兑换成0分的方法数设置为1
            dp[j][0] = 1;
        for(int i = 1; i < w.length; i++){ //遍历四种硬币,索引从1开始
            for(int j = 1; j <= n; j++){
                if(j >= w[i]) //j大于第i个硬币的面值，那么i个硬币兑换成j分的方法数 = i-1个硬币兑换成j分的方法数 + i个硬币兑换成j-w[i]分的方法数
                    dp[i][j] = dp[i-1][j] + dp[i][j-w[i]];
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        for(int i=1;i<w.length;i++){
            for(int j=1;j<=n;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[w.length - 1][n];
    }


}