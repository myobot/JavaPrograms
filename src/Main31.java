import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/09.
 */
public class Main31 {
    public static void main(String args[]){
//        Scanner in=new Scanner(System.in);
//        String s=in.nextLine();
//        BigInteger b=new BigInteger(s);
//        b=b.multiply(new BigInteger("4"));
//        b=myBigNumSqrt(b);
//        b=b.add(new BigInteger("-1")).divide(new BigInteger("2"));
//        System.out.println(b);
//        char[] c=s.toCharArray();
        System.out.println(toLower('A')+""+toLower('a'));
    }
    public static char toLower(char c){
        char a='a';
        char A='A';
        int e=a-A;
        if(c<'a'){
            c=(char)(c+e);
        }
        return c;
    }
    public static BigInteger myBigNumSqrt(BigInteger xx)
    {
        BigDecimal x=new BigDecimal(xx);
        BigDecimal n1=BigDecimal.ONE;
        BigDecimal ans=BigDecimal.ZERO;
//int i=1;
        while((n1.multiply(n1).subtract(x)).abs().compareTo(BigDecimal.valueOf(0.001))==1)
        {
//System.out.println(i+"..."+n1);
//i++;
            BigDecimal s1=x.divide(n1,2000,BigDecimal.ROUND_HALF_UP);
            BigDecimal s2=n1.add(s1);
            n1=s2.divide(BigDecimal.valueOf(2),2000,BigDecimal.ROUND_HALF_UP);

        }
        ans=n1;
//System.out.println(ans);
        BigInteger rt =new BigInteger(ans.toString().split("\\.")[0]);
        return rt;
    }
}
