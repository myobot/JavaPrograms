/**
 * Created by WZW on 2017/08/22.
 * 给定一个数组m
 * 每次只能向下或向右走一步
 * 求到右下角最小步数和
 */
public class DTGH3 {
    public static void main(String args[]){
        int m[][]={{1,3,8,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}};
        int d[][]=new int[m.length][m[0].length];
        for(int i=0;i<d.length;i++){
            d[i][0]=(i-1>=0?d[i-1][0]:0)+m[i][0];
        }
        for(int i=0;i<d[0].length;i++){
            d[0][i]=(i-1>=0?d[0][i-1]:0)+m[0][i];
        }
        for(int i=1;i<d.length;i++){
            for(int j=1;j<d[i].length;j++){
                d[i][j]=Math.min(d[i-1][j],d[i][j-1])+m[i][j];
            }
        }
        System.out.println(d[d.length-1][d[0].length-1]);
    }
}
