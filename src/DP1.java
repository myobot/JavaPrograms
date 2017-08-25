/**
 * Created by WZW on 2017/08/09.
 * 最长非降序子序列
 */
public class DP1 {
    public static void main(String args[]){
        int a[]={5,3,4,8,6,7};
        int d[]=new int[a.length+1];
        d[1]=1;
        for(int i=2;i<d.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=1;j<i;j++){
                if(max<d[j]){
                    max=d[j];
                }
            }
            if(a[i-1]>a[i-2]){
                d[i]=max+1;
            }else{
                d[i]=max;
            }
        }
        System.out.println(d[a.length]);
    }
}
