import java.math.BigInteger;

/**
 * Created by WZW on 2017/08/08.
 * 编写应用程序，分别使用while和for循环计算8+88+888+n前10项之和。
 */

public class Main22{
    public static void main(String args[]){
//         long temp=8;
//         long sum=0;
        BigInteger temp=new BigInteger("8");
        BigInteger sum=new BigInteger("0");
        BigInteger end=new BigInteger("8888888888");
         while(temp.compareTo(end)<=0){
                sum=sum.add(temp);
                temp=temp.multiply(new BigInteger("10")).add(new BigInteger("8"));
         }
           System.out.println(sum);
           temp=new BigInteger("8");
           sum=new BigInteger("0");
            for(int i=0;i<10;i++){
                sum=sum.add(temp);
                temp=temp.multiply(new BigInteger("10")).add(new BigInteger("8"));
            }
            System.out.println(sum);
     }
}
