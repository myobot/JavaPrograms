/**
 * Created by WZW on 2017/08/12.
 */
import java.util.*;
public class Main89{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        long x=in.nextLong();
        long f=in.nextLong();
        long d=in.nextLong();
        long p=in.nextLong();
        System.out.println(d+(d-x*f)/(x+p));
    }
}