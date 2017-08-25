/**
 * Created by WZW on 2017/08/11.
 */
import java.util.*;
public class Main67{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String s[] = str.split(" ");
        char c[] = s[0].toCharArray();
        char c2[] = s[1].toCharArray();
        int a[] = new int[c.length];
        int b[] = new int[c2.length];
        boolean flag = true;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > '9' || c[i] < '0') {
                flag = false;
            }
            a[i] = c[i] - '0';
        }
        for (int i = 0; i < c2.length; i++) {
            if (c2[i] > '9' || c2[i] < '0') {
                flag = false;
            }
            b[i] = c2[i] - '0';
        }
        if (flag) {
            int d[] = new int[Math.max(a.length, b.length) + 1];
            int indexa = a.length - 1;
            int indexb = b.length - 1;
            int indexd = d.length - 1;
            while (indexa >= 0 && indexb >= 0) {
                d[indexd--] = a[indexa--] + b[indexb--];
            }
            while (indexa >= 0) {
                d[indexd--] = a[indexa--];
            }
            while (indexb >= 0) {
                d[indexd--] = b[indexb--];
            }
            for (int i = d.length - 1; i > 0; i--) {
                if (d[i] > 10) {
                    int temp = d[i] / 10;
                    d[i] = d[i] % 10;
                    d[i - 1] += temp;
                }
            }
            for (int i = 0; i < d.length; i++) {
                if (i==0&&d[i] == 0) {
                    continue;
                }
                System.out.print(d[i]);
            }
        }else{
            System.out.println("Error");
        }
    }
}
