import java.awt.*;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Main4 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();

        int first=Integer.MIN_VALUE,second=Integer.MIN_VALUE,third=Integer.MIN_VALUE;
        for(int i=0;i<N;i++) {
            int next = in.nextInt();
            if (abs(next) > abs(first)) {
                third = second;
                second = first;
                first = next;
            } else if (abs(next)>abs(second)) {
                third = second;
                second = next;
            } else if (abs(next) > abs(third)) {
                third = next;
            }
        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(abs(first*second*third));
    }
    public static int abs(int a){
        return a<0?-a:a;
    }
}
