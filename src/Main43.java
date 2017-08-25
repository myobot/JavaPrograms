/**
 * Created by WZW on 2017/08/09.
 * 小易来到了一条石板路前，每块石板上从1挨着编号为：1、2、3.......
 这条石板路要根据特殊的规则才能前进：对于小易当前所在的编号为K的 石板，小易单次只能往前跳K的一个约数(不含1和K)步，即跳到K+X(X为K的一个非1和本身的约数)的位置。 小易当前处在编号为N的石板，他想跳到编号恰好为M的石板去，小易想知道最少需要跳跃几次可以到达。
 例如：
 N = 4，M = 24：
 4->6->8->12->18->24
 于是小易最少需要跳跃5次，就可以从4号石板跳到24号石板
 */
import java.util.*;
import java.util.ArrayList;
public class Main43 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int d[] = new int[m + 1];
        d[n] = 0;
        d[n + 1] = -1;
        for (int i = n + 2; i <= m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i - 2; j >= n; j--) {
                ArrayList<Integer> list = getAppNums(j);
                for (int k = 0; k < list.size(); k++) {
                    if (list.get(k) + j == i) {
                        if (d[i - list.get(k)] < 0) {
                            continue;
                        }
                        if (d[i - list.get(k)] < min) {
                            min = d[i - list.get(k)];
                        }
                    }
                }
            }
            d[i] = min + 1;
        }
        if (d[m] < 0) {
            System.out.println("-1");
        } else {
            System.out.println(d[m]);
        }

    }

    public static ArrayList<Integer> getAppNums(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (n / i != i) {
                    list.add(n / i);
                }
            }
        }
        return list;
    }
}