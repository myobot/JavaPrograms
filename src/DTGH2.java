/**
 * Created by WZW on 2017/08/22.
 * n级台阶
 * 一个人可以一次上一级或两级，到n级有多少种走法
 */
public class DTGH2 {
    public static void main(String args[]){
        int n=100;
        long d[]=new long[n+1];
        d[1]=1;
        d[2]=2;
        for(int i=3;i<d.length;i++){
            d[i]=d[i-1]+d[i-2];
        }
        System.out.println(d[n]);
    }

}
