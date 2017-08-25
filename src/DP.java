/**
 * Created by WZW on 2017/08/09.
 * 1,3,5硬币凑11
 */
public class DP {
    public static void main(String args[]){
        int d[]=new int[12];
        int v[]={1,3,5};
        d[0]=0;
        for(int i=1;i<12;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<v.length;j++){
                if(i-v[j]<0){
                    break;
                }
                if(min>(d[i-v[j]]+1)){
                    min=d[i-v[j]]+1;
                }
            }
            d[i]=min;
        }
        System.out.println(d[11]);
    }
}
