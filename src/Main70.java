import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/11.
 */
public class Main70 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[100000];
        int maxday=Integer.MIN_VALUE;
        while (in.hasNext()) {
            String str = in.nextLine();
            String s[] = str.split(" ");
            if(str.equals("-1")){
                break;
            }
            int begin = Integer.parseInt(s[0]);
            int end = Integer.parseInt(s[1]);
            int money = Integer.parseInt(s[2]);
            for (int i = begin; i <= end; i++) {
                a[i] = money;
            }
            maxday=Math.max(end,maxday);
        }
        int begin=1;
        for(int i=1;i<=maxday;i++){
            if(a[i]!=a[i+1]){
                if(i==maxday){
                    System.out.print("["+begin+", "+i+", "+a[i]+"]");
                }else {
                    System.out.print("[" + begin + ", " + i + ", " + a[i] + "],");
                }
                begin=i+1;
            }
        }
    }

}
