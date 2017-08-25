/**
 * Created by WZW on 2017/08/12.
 */
import java.util.Scanner;
public class Main91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int n=in.nextInt();
            long x[]=new long[n];
            long y[]=new long[n];
            for(int i=0;i<n;i++){
                x[i]=in.nextLong();
            }
            for(int i=0;i<n;i++){
                y[i]=in.nextLong();
            }
            for(int i=1;i<=n;i++){
                if(i==0){
                    System.out.print(0+" ");
                }else {
                    long min = Long.MAX_VALUE;
                    for (int j = 0; j <=n - i; j++) {
                        long smidx = 0;
                        long smidy = 0;
                        for (int k = j; k < j + i; k++) {
                            smidx += x[k];
                            smidy += y[k];
                        }
                        long midx = smidx / i;
                        long midy = smidy / i;
                        long sum = 0;
                        for (int k = j; k < j + i; k++) {
                            sum += abs(x[k] - midx);
                            sum += abs(y[k] - midy);
                        }
                        if (sum < min) {
                            min = sum;
                        }
                    }

                    if (i == n) {
                        System.out.print(min);
                    } else {
                        System.out.print(min + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static long abs(long a){
        if(a<0){
            return -a;
        }else{
            return a;
        }
    }
}