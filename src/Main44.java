/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main44{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long sum=0;
        for(int i=1;i<=a;i++){
            sum+=getMax(i);
        }
        System.out.println(sum);
    }
    public static long getMax(long a){
        long ans=1;
        if(a%2==1){
            return a;
        }
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                if((a/i)%2==1){
                    ans=a/i;
                    break;
                }
            }
        }
        return ans;
    }
}