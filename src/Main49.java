/**
 * Created by WZW on 2017/08/10.
 */
import java.util.*;
public class Main49 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int m = in.nextInt();
            int table[] = new int[n];
            for (int i = 0; i < n; i++) {
                table[i] = in.nextInt();
            }
            Arrays.sort(table);
            PriorityQueue<Customer> queue = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                int p = in.nextInt();
                int me = in.nextInt();
                if (p <= table[n - 1]) {
                    queue.add(new Customer(p, me));
                }
            }
            long sum = 0;
            int count=0;
            while (!queue.isEmpty()) {
                Customer c = queue.poll();
                for (int i = 0; i < table.length; i++) {
                    if (table[i] >= c.peoples) {
                        sum += c.money;
                        table[i] = -1;
                        count++;
                        break;
                    }
                }
                if(count==n){
                    break;
                }
            }
            System.out.println(sum);
        }
    }

    public static boolean allTakes(int tables[]) {
        for (int i = 0; i < tables.length; i++) {
            if (tables[i] != -1) {
                return false;
            }
        }
        return true;
    }
}
class Customer implements Comparable<Customer> {
    public int peoples;
    public int money;

    public Customer(int peoples, int money) {
        this.peoples = peoples;
        this.money = money;
    }

    public int compareTo(Customer o) {
        if (o.money > this.money) return 1;
        else if (o.money < this.money) return -1;
        return 0;
    }
}