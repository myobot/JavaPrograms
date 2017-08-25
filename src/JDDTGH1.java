/**
 * Created by WZW on 2017/08/22.
 * 1 2 5 10 20 100  aim 组合方法数
 */
public class JDDTGH1 {
    public static void main(String ags[]){
        int aim=1000;
        int a[]={1,2,5,10,20,100};
        int dp[][]=new int[6][1000+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=1;
        }
        for(int i=a[0];i<dp[0].length;i+=a[0]){
            dp[0][i]=1;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                dp[i][j]=dp[i-1][j]+(j-a[i]>=0?dp[i][j-a[i]]:0);
            }
        }
        System.out.println(dp[5][1000]);
    }

}
