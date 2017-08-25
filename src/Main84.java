/**
 * Created by WZW on 2017/08/12.
 */
import java.util.*;
public class Main84{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int d[]=new int[n+1];
        int v[]={6,8};
        for(int i=0;i<d.length;i++){
            d[i]=Integer.MAX_VALUE-1;
        }
        d[6]=1;
        d[7]=Integer.MAX_VALUE;
        d[8]=1;
        for(int i=9;i<=n;i++){
            int min=Integer.MAX_VALUE-1;
            for(int j=0;j<v.length;j++){
                min=Math.min(d[i-v[j]],min);
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