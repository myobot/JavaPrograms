/**
 * Created by WZW on 2017/08/22.
 * 最长递增子序列
 *
 */
public class DTGH4 {
    public static void main(String args[]){
        int a[]={2,1,5,3,6,4,8,9,7};
        int d[]=new int[a.length];
        d[0]=1;
        for(int i=1;i<d.length;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j>=0;j--){
                if(a[j]<=a[i]){
                    if(max<(d[j]+1)){
                        max=d[j]+1;
                    }
                }else {
                    if (max < d[j]) {
                        max=d[j];
                    }
                }
            }
            d[i]=max;
        }
        System.out.println(d[d.length-1]);
    }
}
