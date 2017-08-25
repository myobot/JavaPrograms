import java.math.BigInteger;
import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Main5 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String a[]=str1.split(" ");
        BigInteger bigInteger=new BigInteger(a[1]);
        BigInteger bigInteger1=new BigInteger(a[0]);
        BigInteger ans=bigInteger.multiply(bigInteger1);
        System.out.println(ans.toString());
    }
}
