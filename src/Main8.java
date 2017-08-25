/**
 * Created by WZW on 2017/08/02.
 */
import java.util.*;
import java.math.BigDecimal;
public class Main8{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        boolean a[]=new boolean[N];
        for(int i=0;i<N;i++){
            long sum=0;
            sum+=in.nextLong();
            sum+=in.nextLong();
            if(sum>in.nextLong()){
                a[i]=true;
            }else{
                a[i]=false;
            }
        }
        for(int i=0;i<N;i++){
            System.out.println("Case #"+(i+1)+": "+a[i]);
        }
        BigDecimal b=new BigDecimal(123/(3*0.1));
        b.setScale(2, BigDecimal.ROUND_HALF_UP);

    }
}