/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main51{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sum=(n/5);
        sum+=n/50;
        sum+=n/100;
        sum+=n/200;
        sum+=n/300;
        sum+=n/400;
        sum+=n/500;
        sum+=n/600;
        sum+=n/700;
        sum+=n/800;
        sum+=n/900;
        sum+=(n/1000)*2;
        System.out.println(sum);
    }
}