/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Test21{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int students[]=new int[n];
        for(int i=0;i<n;i++){
            students[i]=Math.abs(in.nextInt());
        }
        int k=in.nextInt();
        int d=in.nextInt();
        int c=k*d;
        int maxs[]=new int[k];
        Long max=Long.MIN_VALUE;
        for(int i=0;i<n;i+=c){
            for(int t=0;t<k;t++){
                maxs[t]=Integer.MIN_VALUE;
            }
            for(int j=0;j<c;j++){
                if(j+i>=n){
                    break;
                }
                for(int p=0;p<k;p++){
                    if(students[j+i]>maxs[p]){
                        for(int u=k-1;u>p;u--){
                            maxs[u]=maxs[u-1];
                        }
                        maxs[p]=students[j+i];
                        break;
                    }
                }
            }
            Long mu=1L;
            for(int t=0;t<k;t++){
                mu*=maxs[t];
            }
            if(mu>max){
                max=mu;
            }
        }
        System.out.println(max);
    }
}