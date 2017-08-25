/**
 * Created by WZW on 2017/08/22.
 * 最长公共子序列
 */
public class DTGH5 {
    public static void main(String args[]){
        String a="1A2C3D4B56";
        String b="B1D23CA45B6A";
        char ca[]=a.toCharArray();
        char cb[]=b.toCharArray();
        int d[][]=new int[ca.length][cb.length];
        for(int i=0;i<d.length;i++){
            d[i][0]=(i-1>=0?d[i-1][0]:0);
            if(cb[0]==ca[i]){
                d[i][0]=1;
            }
        }
        for(int i=0;i<d[0].length;i++){
            d[0][i]=(i-1>=0?d[0][i-1]:0);
            if(ca[0]==cb[i]){
                d[0][i]=1;
            }
        }
        for(int i=1;i<d.length;i++){
            for(int j=1;j<d[i].length;j++){
                if(ca[i]==cb[j]){
                    d[i][j]=Math.max(d[i-1][j-1]+1,d[i][j]);
                }
                d[i][j]=Math.max(d[i-1][j],d[i][j]);
                d[i][j]=Math.max(d[i][j-1],d[i][j]);
            }
        }
        System.out.println(d[d.length-1][d[0].length-1]);
    }
}
