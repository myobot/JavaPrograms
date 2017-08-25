/**
 * Created by WZW on 2017/08/09.
 */
import java.util.*;
public class Main33{
    public static void main(String args[]){
        StringBuilder stringBuilder=new StringBuilder();
        String s=new String();
        s.length();
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        Arrays.sort(a);
        System.out.println(dfs(0,0L,1L,a,n));
    }
    public static int dfs(int begin,long sum,long pi,int a[],int n){
        int c=0;
        for(int i=begin;i<n;i++){
            sum+=a[i];
            pi*=a[i];
            if(sum>pi){
                c+=1+dfs(i+1,sum,pi,a,n);
            }else if(a[begin]==1){
                c+=dfs(i+1,sum,pi,a,n);
            }else{
                break;
            }
            sum-=a[i];
            pi/=a[i];
            while(i<n-1 && a[i]==a[i+1])
                i++;
        }
        return c;
    }
}