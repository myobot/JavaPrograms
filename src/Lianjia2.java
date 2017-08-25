/**
 * Created by WZW on 2017/08/19.
 */
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Lianjia2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (in.hasNextInt()) {
            int n = in.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int a = in.nextInt();
                if (!list.contains(a)) {
                    list.add(a);
                }
            }
            int a[] = new int[list.size()];
            for (int i = 0; i < a.length; i++) {
                a[i] = list.get(i);
            }
            for (int i = 0; i < a.length; i++) {
                for (int j = i; j < a.length; j++) {
                    if (a[i] > a[j]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            System.out.println(a.length);
            for (int i = 0; i < a.length; i++) {
                if (i == a.length - 1) {
                    System.out.println(a[i]);
                } else {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }
}