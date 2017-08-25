/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main65{
    static int count=0;
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int d[][]=new int[n+2][m+2];
        for(int i=1;i<=n+1;i++){
            for(int j=1;j<=m+1;j++){
                if(i==1&&j==1){
                    d[i][j]=1;
                    continue;
                }
                d[i][j]=d[i-1][j]+d[i][j-1];
            }
        }
        System.out.println(d[n+1][m+1]);
    }
}