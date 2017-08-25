/**
 * Created by WZW on 2017/08/19.
 */
import java.io.*;
import java.util.*;
public class Lianjia3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n = in.nextInt();
            long a[] = new long[n];
            long temp = 0;
            for (int i = 0; i < n; i++) {
                long t = in.nextInt();
                a[i] = t + temp;
                temp = a[i];
            }
            int q = in.nextInt();
            for (int i = 0; i < q; i++) {
                int p = in.nextInt();
                for (int j = 0; j < a.length; j++) {
                    if (a[j] >= p) {
                        System.out.println(j + 1);
                        break;
                    }
                }
            }
        }
    }
}