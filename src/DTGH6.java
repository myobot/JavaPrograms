/**
 * Created by WZW on 2017/08/22.
 * 0,1背包
 */
public class DTGH6 {
    public static void main(String args[]){
        int v[]={1,3,4,6,1,4,6,8,54,11};
        int w[]={12,3,4,6,82,34,6,78,90,3};
        int m=100;
        int d[][]=new int[v.length][m+1];
        for(int i=0;i<d.length;i++){
            d[i][0]=0;
        }
        for(int i=0;i<d[0].length;i++){
            if(i>=w[0]){
                d[0][i]=v[0];
            }
        }
        for(int i=1;i<d.length;i++){
            for(int j=1;j<d[i].length;j++){
                if(j-w[i]>0)
                    d[i][j]=Math.max(d[i-1][j],d[i-1][j-w[i]]+v[i]);
                else
                    d[i][j]=d[i-1][j];
            }
        }
        System.out.println(d[d.length-1][m]);
    }
}
