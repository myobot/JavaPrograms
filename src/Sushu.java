import java.util.Scanner;

/**
 * Created by WZW on 2017/08/07.
 */
public class Sushu {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println(find2(n, m));
    }
    public static int find(int n,int m){
        int count=0;
        for(int i=n;i<=m;i++){
            if (charge(i)) {
                count++;
            }
        }
        return count;
    }
    public static boolean charge(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int find2(int n,int m){
        boolean a[]=new boolean[m-n];
        for(int i=2;i<m;i++) {
            if (i>=n&&!a[i-n]) {
                a[i-n] = false;
            }
            for (int j = n; j < m; j++) {
                if((j-n)==(i-n))
                    continue;
                if (!a[j-n]&&j % i == 0) {
                    a[j - n] = true;
                }
            }
        }

        int count=0;
        for(int i=0;i<a.length;i++){
            if(!a[i]){
                count++;
            }
        }
        return count;
    }
}
