/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main48{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int n=in.nextInt();
            int a[]=new int[n+1];
            long d[][]=new long[n+1][n+1];
            long max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                a[i+1]=in.nextInt();
                max=Math.max(a[i+1],max);
            }

            for(int k=1;k<=n;k++){
                d[k][k]=a[k];
                for(int i=k+1;i<=n;i++){
                    d[k][i]=d[k][i-1]+a[i];
                    max=Math.max(d[k][i],max);
                }
            }
            System.out.println(max);
        }
    }
}