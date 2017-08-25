/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main47{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d[]=new int[101];
        int v[]=new int[2];
        v[0]=6;
        v[1]=8;
        for(int i=0;i<d.length;i++){
            d[i]=Integer.MAX_VALUE-1;
        }
        d[6]=1;
        d[8]=1;
        for(int i=9;i<=n;i++){
            int min=Integer.MAX_VALUE-1;
            for(int j=0;j<2;j++){
                min=Math.min(min,d[i-v[j]]);
            }
            d[i]=min+1;
        }
        if(d[n]==Integer.MAX_VALUE){
            System.out.println("-1");
        }else{
            System.out.println(d[n]);
        }
    }
}
