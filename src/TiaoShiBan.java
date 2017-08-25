/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class TiaoShiBan{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int d[]=new int[m-n+1];
        d[0]=0;
        for(int i=1;i<d.length;i++){
            d[i]=Integer.MAX_VALUE;
        }
        for(int i=0;i<d.length;i++){
            if(d[i]==Integer.MAX_VALUE){
                continue;
            }
            LinkedList<Integer> list=getAllYue(i+n);
            for(int j=0;j<list.size();j++){
                int x=list.get(j);
                if(i + n + x <= m)
                    d[i+x]=Math.min(d[i+x],d[i]+1);
            }
        }
        if(d[m-n]==Integer.MAX_VALUE){
            System.out.println("-1");
        }else
            System.out.println(d[m-n]);
    }
    public static LinkedList<Integer> getAllYue(int n){
        LinkedList<Integer> list=new LinkedList<Integer>();
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}