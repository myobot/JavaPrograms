/**
 * Created by WZW on 2017/08/02.
 */
import java.util.*;
import java.util.Stack;

public class Main11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, Integer[]> map = getMap();
        s.nextInt();
        while (s.hasNext()) {
            Integer[] ints = parseString(s.next());
            Stack<Integer> l = new Stack<>();
            constructString(ints, 0, map, l, false);

            StringBuilder sb = new StringBuilder();
            for (Integer c : l) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }

    private static boolean constructString(Integer[] s, int i, HashMap<Integer, Integer[]> map, Stack<Integer> l, boolean flag) {
        if (l.size() == 0) {
            l.push(s[i]);
            if (constructString(s, i + 1, map, l, false)) {
                return true;
            }
            l.set(0, l.peek() - 1);
            return constructString(s, i + 1, map, l, true);
        }
        if (i == s.length)
            return true;
        if (flag) {
            Integer[] q = map.get(l.peek());
            l.push(q[q.length - 1]);
            return constructString(s, i + 1, map, l, flag);
        }

        Integer j = 0, B[] = map.get(l.peek());
        for (; j < B.length; j++) {
            if (B[j] > s[i])
                break;
        }
        for (j--; j > -1; j--) {
            l.push(B[j]);
            if (B[j] < s[i])
                flag = true;
            if (constructString(s, i + 1, map, l, flag))
                return true;
            l.pop();
        }
        return false;
    }

    public static Integer[] parseString(String s) {
        Integer[] ints = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ints[i] = s.charAt(i) - 48;
        }
        return ints;
    }

    public static HashMap<Integer, Integer[]> getMap() {
        Integer A[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        HashMap<Integer, Integer[]> map = new HashMap<>();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int x = i; x < 3; x++) {
                    for (int y = j; y < 3; y++) {
                        l.add(A[x][y]);
                    }
                }
                if (j <= 1) {
                    l.addFirst(0);
                }
                map.put(A[i][j], l.toArray(new Integer[0]));
                l.clear();
            }
        }
        map.put(0, new Integer[]{0});
        return map;
    }
}
