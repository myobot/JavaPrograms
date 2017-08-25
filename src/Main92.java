import java.math.BigInteger;
import java.util.BitSet;

/**
 * Created by WZW on 2017/08/12.
 */
public class Main92 {
    public static void main(String args[]){
        BigInteger s=new BigInteger("1");
        for(int i=50;i>25;i--){
            s=s.multiply(new BigInteger(i+""));
        }
        for(int i=2;i<=25;i++){
            s=s.divide(new BigInteger(i+""));
        }
        System.out.println(s);
    }
}
