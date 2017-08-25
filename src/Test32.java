/**
 * Created by WZW on 2017/08/10.
 */
public class Test32 {
    public static void main(String args[]){
        long d1=3;
        long d2=9;
        long ans;
        for(int i=3;i<=10;i++){
            ans=d2*2+d1;
            d1=d2;
            d2=ans;
            System.out.println(ans);
        }
        System.out.println();
        long d[]=new long[31];
        d[1]=3;
        d[2]=9;
        for(int i=3;i<=10;i++){
            d[i]=d[i-1]*2+d[i-2];
            System.out.println(d[i]);
        }

    }
}
