/**
 * Created by WZW on 2017/08/11.
 * 题目描述
 有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。请设计一个算法，计算小团有多少种走法。给定两个正整数int x,int y，请返回小团的走法数目。
 输入描述:
 输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。
 输出描述:
 输出包括一行，为走法的数目。
 示例1
 输入

 3 2
 输出

 10
 */
import java.util.*;
public class Main64{
    static int count=0;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        boolean [][] visited=new boolean[n+1][m+1];
        dfs(visited,0,0,m+1,n+1);
        System.out.println(count);
    }
    public static void dfs(boolean [][] visited,int x,int y,int m,int n){
        if(x==n-1&&y==m-1){
            count++;
        }
        else{
            if(x+1<n&&y<m&&!visited[x+1][y]) {
                if((x+1)!=n-1||y!=m-1) {
                    visited[x + 1][y] = true;
                }
                dfs(visited, x + 1, y, m, n);
            }
            if(x<n&&y+1<m&&!visited[x][y+1]) {
                if(x!=n-1||(y+1)!=m-1) {
                    visited[x][y + 1] = true;
                }
                dfs(visited, x, y + 1, m, n);
            }
        }
    }
}