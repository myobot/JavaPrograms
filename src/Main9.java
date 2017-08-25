/**
 * Created by WZW on 2017/08/02.
 */
import java.util.*;
import java.math.BigDecimal;
public class Main9{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int A1=0,A2=0,A3=0,A4=0,A5=0;
        int flag=1,count=0;
        while(in.hasNext()){
            int n=in.nextInt();
            if(n%5==0&&n%2==0){
                A1+=n;
            }
            if(n%5==1){
                A2+=n*flag;
                flag*=-1;
            }
            if(n%5==2){
                A3++;
            }
            if(n%5==3){
                A4+=n;
                count++;
            }
            if(n%5==4){
                if(n>A5){
                    A5=n;
                }
            }
        }
        BigDecimal b=new BigDecimal(A5*1.0/count);
        b.setScale(2,BigDecimal.ROUND_HALF_UP);
        if(A1==0){
            System.out.print("N ");
        }else{
            System.out.print(A1+" ");
        }
        if(A2==0){
            System.out.print("N ");
        }else{
            System.out.print(A2+" ");
        }
        if(A3==0){
            System.out.print("N ");
        }else{
            System.out.print(A3+" ");
        }
        if(b.doubleValue()==0){
            System.out.print("N ");
        }else{
            System.out.print(b.doubleValue()+" ");
        }
        if(A5==0){
            System.out.print("N ");
        }else{
            System.out.print(A5+" ");
        }
    }
}
